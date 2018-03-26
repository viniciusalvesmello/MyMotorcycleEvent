package rocks.yourapp.mymotorcycleevent.cache.media.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "image")
data class ImageCacheModel(
        @PrimaryKey(autoGenerate = true)
        val uuid: Long,
        val name: String,
        val type: String,
        var path: String = "",
        var url: String = "",
        var synced: Boolean = false
)