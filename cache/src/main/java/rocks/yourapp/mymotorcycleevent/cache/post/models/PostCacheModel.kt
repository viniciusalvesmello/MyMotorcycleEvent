package rocks.yourapp.mymotorcycleevent.cache.post.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.Relation
import rocks.yourapp.mymotorcycleevent.cache.media.models.MediaCacheModel

@Entity(tableName = "post")
data class PostCacheModel (
        @PrimaryKey(autoGenerate = true)
        val uuid: Long,
        @Relation(parentColumn = "uuid", entityColumn = "postId")
        val media: List<MediaCacheModel>,
        var descripition: String = "",
        var synced: Boolean = false
)