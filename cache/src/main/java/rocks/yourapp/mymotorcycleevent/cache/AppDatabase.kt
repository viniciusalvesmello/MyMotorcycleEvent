package rocks.yourapp.mymotorcycleevent.cache

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import rocks.yourapp.mymotorcycleevent.cache.posts.dao.MediaDao
import rocks.yourapp.mymotorcycleevent.cache.posts.model.MediaCacheModel
import rocks.yourapp.mymotorcycleevent.cache.posts.dao.PostDao
import rocks.yourapp.mymotorcycleevent.cache.posts.model.PostCacheModel

@Database(
        entities = [
            PostCacheModel::class,
            MediaCacheModel::class
        ],
        version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
    abstract fun mediaDao(): MediaDao
}
