
package com.gaurav.flipbookdiary.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import java.time.LocalDate

@Composable
fun DiaryReaderScreen(onNavigateSettings: () -> Unit, onNavigateCalendar: () -> Unit) {
    val today = remember { LocalDate.now() }
    Column(Modifier.fillMaxSize()) {
        TopAppBar(title = { Text("Flipbook Diary") }, actions = {
            IconButton(onClick = onNavigateCalendar) { Text("Calendar") }
            IconButton(onClick = onNavigateSettings) { Text("Settings") }
        })
        Box(Modifier.fillMaxSize()) {
            FlipbookPage(
                pageBitmap = ImageBitmap(1,1),
                nextBitmap = ImageBitmap(1,1),
                dragPoint = null,
                onFlipComplete = {}
            )
        }
    }
}

@Composable
fun FlipbookPage(
    pageBitmap: ImageBitmap,
    nextBitmap: ImageBitmap,
    dragPoint: Offset?,
    onFlipComplete: (Direction) -> Unit
) {
    // TODO: Implement curl rendering using Canvas & shaders
    // Placeholder UI
    Box(Modifier.fillMaxSize()) {
        Text("Flipbook page placeholder", Modifier.padding(16.dp))
    }
}

enum class Direction { Forward, Back }
