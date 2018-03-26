package rocks.yourapp.mymotorcycleevent.cache.media.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.Relation

@Entity(tableName = "media")
data class MediaCacheModel(
        @PrimaryKey(autoGenerate = true)
        val uuid: Long,
        val postId: Long,
        val typeMedia: String = "image",
        @Relation()
        val imageId: Long = 0L,
        val videoId: Long = 0L,
        var synced: Boolean = false
)