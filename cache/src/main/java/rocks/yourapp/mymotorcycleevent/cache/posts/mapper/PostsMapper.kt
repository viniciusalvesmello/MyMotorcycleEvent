package rocks.yourapp.mymotorcyclecache.posts.mapper

import rocks.yourapp.mymotorcycleevent.cache.posts.model.MediaCacheModel
import rocks.yourapp.mymotorcycleevent.cache.posts.model.PostCacheModel
import rocks.yourapp.mymotorcycleevent.data.posts.model.MediaEntity
import rocks.yourapp.mymotorcycleevent.data.posts.model.PostEntity

fun PostCacheModel.toPostEntity() = PostEntity(
        id = uuid,
        description = description,
        name = name,
        date = date,
        site = site,
        street = street,
        complement = complement,
        number = number,
        district = district,
        zipCode = zipCode,
        cityId = cityId,
        stateId = stateId,
        countryId = countryId,
        latitude = latitude,
        longitude = longitude,
        synced = synced
)

fun PostEntity.toPostCacheModel() = PostCacheModel(
        uuid = id,
        description = description,
        name = name,
        date = date,
        site = site,
        street = street,
        complement = complement,
        number = number,
        district = district,
        zipCode = zipCode,
        cityId = cityId,
        stateId = stateId,
        countryId = countryId,
        latitude = latitude,
        longitude = longitude,
        synced = synced
)

fun MediaCacheModel.toMediaEntity() = MediaEntity(
        id = uuid,
        postId = postId,
        typeMedia = typeMedia,
        path = path,
        url = url,
        synced = synced
)

fun MediaEntity.toMediaChacheModel() = MediaCacheModel(
        uuid = id,
        postId = postId,
        typeMedia = typeMedia,
        path = path,
        url = url,
        synced = synced
)