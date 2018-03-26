package rocks.yourapp.mymotorcycleevent.cache.media.dao

import android.arch.persistence.room.*
import rocks.yourapp.mymotorcycleevent.cache.media.models.VideoCacheModel

@Dao
interface VideoDao {
    @Query("SELECT * FROM video")
    fun loadAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(video: List<VideoCacheModel>)

    @Delete
    fun delete(video: List<VideoCacheModel>)
}