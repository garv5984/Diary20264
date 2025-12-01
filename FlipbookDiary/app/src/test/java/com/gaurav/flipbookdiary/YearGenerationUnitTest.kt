
package com.gaurav.flipbookdiary

import com.gaurav.flipbookdiary.data.repo.buildPagesForYear
import org.junit.Assert.assertEquals
import org.junit.Test

class YearGenerationUnitTest {
    @Test
    fun normalYearHas365Days() {
        val dates = buildPagesForYear(2027)
        assertEquals(365, dates.size)
    }
}
