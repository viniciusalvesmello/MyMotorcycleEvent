package rocks.yourapp.mymotorcycleevent.cache.posts.model

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "post")
data class PostCacheModel(
        @PrimaryKey(autoGenerate = true)
        val uuid: Long,
        var description: String = "",
        var name: String = "",
        var date: String = "",
        var site: String = "",
        var street: String = "",
        var complement: String = "",
        var number: String = "S/N",
        var district: String = "",
        var zipCode: String = "",
        var cityId: Long = 0L,
        var stateId: Long = 0L,
        var countryId: Long = 0L,
        var latitude: String = "",
        var longitude: String = "",
        var synced: Boolean = false
)