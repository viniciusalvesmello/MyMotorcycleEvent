package rocks.yourapp.mymotorcycleevent.cache

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import rocks.yourapp.mymotorcycleevent.cache.post.dao.MediaDao
import rocks.yourapp.mymotorcycleevent.cache.post.models.MediaCacheModel
import rocks.yourapp.mymotorcycleevent.cache.post.dao.PostDao
import rocks.yourapp.mymotorcycleevent.cache.post.models.PostCacheModel

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
