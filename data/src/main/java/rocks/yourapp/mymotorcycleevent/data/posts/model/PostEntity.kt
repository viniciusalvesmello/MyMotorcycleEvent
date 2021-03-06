package rocks.yourapp.mymotorcycleevent.data.posts.model

data class PostEntity(
        val id: Long,
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