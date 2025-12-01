
package com.gaurav.flipbookdiary.export

import android.graphics.pdf.PdfDocument
import android.graphics.Canvas

class PdfExporter {
    fun exportMonth(pages: List<android.graphics.Bitmap>): PdfDocument {
        val doc = PdfDocument()
        var pageNum = 1
        for (bmp in pages) {
            val pageInfo = PdfDocument.PageInfo.Builder(bmp.width, bmp.height, pageNum++).create()
            val page = doc.startPage(pageInfo)
            val canvas: Canvas = page.canvas
            canvas.drawBitmap(bmp, 0f, 0f, null)
            doc.finishPage(page)
        }
        return doc
    }
}
