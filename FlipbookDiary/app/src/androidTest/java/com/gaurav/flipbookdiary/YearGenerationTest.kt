
package com.gaurav.flipbookdiary

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gaurav.flipbookdiary.data.repo.buildPagesForYear
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class YearGenerationTest {
    @Test
    fun leapYearHas366Days() {
        val dates = buildPagesForYear(2028)
        assertEquals(366, dates.size)
    }
}
