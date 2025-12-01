
package com.gaurav.flipbookdiary.data.repo

import com.gaurav.flipbookdiary.data.db.*
import java.time.*

class DiaryRepository(private val dao: DayPageDao) {
    suspend fun buildYear(diaryId: Long, year: Int) {
        for (date in buildPagesForYear(year)) {
            dao.upsert(DayPage(diaryId = diaryId, date = date))
        }
    }
}

fun buildPagesForYear(year: Int): List<LocalDate> {
    val start = LocalDate.of(year, Month.JANUARY, 1)
    val end = start.with(java.time.temporal.TemporalAdjusters.lastDayOfYear())
    val dates = mutableListOf<LocalDate>()
    var d = start
    while (!d.isAfter(end)) { dates.add(d); d = d.plusDays(1) }
    return dates
}
