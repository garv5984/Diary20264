
package com.gaurav.flipbookdiary.graphics.handwriting

import android.view.MotionEvent
import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun HandwritingCanvas() {
    AndroidView(factory = { context ->
        object : View(context) {
            override fun onTouchEvent(ev: MotionEvent): Boolean {
                // Stylus-first: accept only stylus input
                val tool = try { ev.getToolType(0) } catch (e: Exception) { MotionEvent.TOOL_TYPE_UNKNOWN }
                if (tool != MotionEvent.TOOL_TYPE_STYLUS) return false
                // TODO: capture x,y,pressure,tilt, and render strokes
                return true
            }
        }
    })
}
