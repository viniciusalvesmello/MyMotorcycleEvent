package rocks.yourapp.mymotorcycleevent.cache.posts.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

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
        var typeMedia: String = "image",
        var path: String = "",
        var url: String = "",
        var synced: Boolean = false
)