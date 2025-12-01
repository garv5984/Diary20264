
package com.gaurav.flipbookdiary.ui.calendar

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CalendarScreen(onBack: () -> Unit) {
    Column(Modifier.fillMaxSize()) {
        TopAppBar(title = { Text("Calendar") }, navigationIcon = { TextButton(onClick = onBack) { Text("Back") } })
        Text("Calendar grid placeholder")
    }
}
