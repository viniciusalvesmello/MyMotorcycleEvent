package rocks.yourapp.mymotorcycleevent.cache.posts.dao

import android.arch.persistence.room.*
import rocks.yourapp.mymotorcycleevent.cache.posts.model.MediaCacheModel

@Dao
interface MediaDao {
    @Query("SELECT * FROM media")
    fun loadAll() : List<MediaCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(media: List<MediaCacheModel>)

    @Delete
    fun delete(media: List<MediaCacheModel>)
}