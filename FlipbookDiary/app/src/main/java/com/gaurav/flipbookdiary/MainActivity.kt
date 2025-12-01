
package com.gaurav.flipbookdiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gaurav.flipbookdiary.ui.pages.DiaryReaderScreen
import com.gaurav.flipbookdiary.ui.settings.SettingsScreen
import com.gaurav.flipbookdiary.ui.calendar.CalendarScreen
import com.gaurav.flipbookdiary.ui.editor.EditorScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    AppNav()
                }
            }
        }
    }
}

@Composable
fun AppNav() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController, startDestination = "reader") {
        composable("reader") { DiaryReaderScreen(onNavigateSettings = { navController.navigate("settings") }, onNavigateCalendar = { navController.navigate("calendar") }) }
        composable("calendar") { CalendarScreen(onBack = { navController.popBackStack() }) }
        composable("editor") { EditorScreen(onBack = { navController.popBackStack() }) }
        composable("settings") { SettingsScreen(onBack = { navController.popBackStack() }) }
    }
}

@Preview
@Composable
fun PreviewApp() { AppNav() }
