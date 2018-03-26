package rocks.yourapp.mymotorcycleevent.cache.post.models

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "post")
data class PostCacheModel(
        @PrimaryKey(autoGenerate = true)
        val uuid: Long,
        var description: String = "",
        @Embedded(prefix = "event_")
        var event: Event = Event(),
        var synced: Boolean = false
)