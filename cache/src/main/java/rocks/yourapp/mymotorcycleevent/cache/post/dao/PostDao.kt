package rocks.yourapp.mymotorcycleevent.cache.post.dao

import android.arch.persistence.room.*
import rocks.yourapp.mymotorcycleevent.cache.post.models.PostCacheModel

@Dao
interface PostDao {
    @Query("SELECT * FROM post")
    fun loadAll() : List<PostCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(post: List<PostCacheModel>)

    @Delete
    fun delete(post: List<PostCacheModel>)
}