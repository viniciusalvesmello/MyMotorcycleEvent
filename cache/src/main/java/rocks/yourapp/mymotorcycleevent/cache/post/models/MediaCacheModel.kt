package rocks.yourapp.mymotorcycleevent.cache.post.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.Relation
import rocks.yourapp.mymotorcycleevent.cache.post.models.PostCacheModel

@Entity(tableName = "media",
        foreignKeys = [
            ForeignKey(
                    entity = PostCacheModel::class,
                    parentColumns = ["uuid"],
                    childColumns = ["postId"],
                    onDelete = ForeignKey.CASCADE)
        ]
)
data class MediaCacheModel(
        @PrimaryKey(autoGenerate = true)
        val uuid: Long,
        val postId: Long,
        val typeMedia: String = "image",
        var path: String = "",
        var url: String = "",
        var synced: Boolean = false
)