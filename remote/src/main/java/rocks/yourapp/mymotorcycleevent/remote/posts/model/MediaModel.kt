package rocks.yourapp.mymotorcycleevent.remote.posts.model

data class MediaModel(
        val uuid: Long,
        val postId: Long,
        var typeMedia: String,
        var path: String,
        var url: String
)