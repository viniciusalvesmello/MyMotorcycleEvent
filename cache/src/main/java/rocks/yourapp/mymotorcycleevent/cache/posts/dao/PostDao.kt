package rocks.yourapp.mymotorcycleevent.cache.posts.dao

import android.arch.persistence.room.*
import rocks.yourapp.mymotorcycleevent.cache.posts.model.PostCacheModel

@Dao
interface PostDao {
    @Query("SELECT * FROM post")
    fun loadAll() : List<PostCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(post: List<PostCacheModel>)

    @Delete
    fun delete(post: List<PostCacheModel>)
}