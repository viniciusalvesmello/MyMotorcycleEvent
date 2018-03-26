package rocks.yourapp.mymotorcycleevent.remote.posts.model

data class PostModel(
        val uuid: Long,
        val description: String,
        val name: String,
        val date: String,
        val site: String,
        val street: String,
        val complement: String,
        val number: String,
        val district: String,
        val zipCode: String,
        val cityId: Long,
        val stateId: Long,
        val countryId: Long,
        val latitude: String,
        val longitude: String
)