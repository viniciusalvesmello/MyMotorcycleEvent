package rocks.yourapp.mymotorcycleevent.cache.media.dao

import android.arch.persistence.room.*
import rocks.yourapp.mymotorcycleevent.cache.media.models.ImageCacheModel

@Dao
interface ImageDao {
    @Query("SELECT * FROM image")
    fun loadAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(image: List<ImageCacheModel>)

    @Delete
    fun delete(image: List<ImageCacheModel>)
}