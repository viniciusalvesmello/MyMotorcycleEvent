package rocks.yourapp.mymotorcycleevent.data.posts.model

data class MediaEntity(
        val id: Long,
        val postId: Long,
        var typeMedia: String = "image",
        var path: String = "",
        var url: String = "",
        var synced: Boolean = false
)