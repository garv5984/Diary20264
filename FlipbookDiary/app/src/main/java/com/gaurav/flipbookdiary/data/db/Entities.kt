
package com.gaurav.flipbookdiary.data.db

import androidx.room.*
import java.time.*

@Entity
data class Diary(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val year: Int,
    val theme: String = "classic",
    val coverStyle: String = "leather"
)

@Entity(indices = [Index(value=["diaryId","date"], unique=true)])
data class DayPage(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val diaryId: Long,
    val date: LocalDate,
    val textRich: String = "",
    val handwritingStrokesJson: String = "",
    val attachments: String = "",
    val tags: String = "",
    val bookmarked: Boolean = false,
    val createdAt: Instant = Instant.now(),
    val updatedAt: Instant = Instant.now()
)

class Converters {
    @TypeConverter fun fromLocalDate(date: LocalDate?): String? = date?.toString()
    @TypeConverter fun toLocalDate(s: String?): LocalDate? = s?.let { LocalDate.parse(it) }
    @TypeConverter fun fromInstant(i: Instant?): String? = i?.toString()
    @TypeConverter fun toInstant(s: String?): Instant? = s?.let { Instant.parse(it) }
}

@Dao
interface DayPageDao {
    @Query("SELECT * FROM DayPage WHERE diaryId=:diaryId AND date=:date")
    suspend fun get(diaryId: Long, date: LocalDate): DayPage?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(page: DayPage)
}

@Database(entities = [Diary::class, DayPage::class], version = 1)
@TypeConverters(Converters::class)
abstract class DiaryDb : RoomDatabase() {
    abstract fun dayPageDao(): DayPageDao
}
