
package com.gaurav.flipbookdiary.ui.editor

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gaurav.flipbookdiary.graphics.handwriting.HandwritingCanvas

@Composable
fun EditorScreen(onBack: () -> Unit) {
    Column(Modifier.fillMaxSize()) {
        TopAppBar(title = { Text("Editor") }, navigationIcon = { TextButton(onClick = onBack) { Text("Back") } })
        // Rich text editor placeholder
        Text("Typing editor placeholder")
        // Handwriting canvas
        HandwritingCanvas()
    }
}
