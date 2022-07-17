package com.casestudy.games_datasource.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GameDetailsDto(
//    @SerialName("achievements_count")
//    val achievementsCount: Int,
//    @SerialName("added")
//    val added: Int,
//    @SerialName("added_by_status")
//    val addedByStatus: AddedByStatus,
//    @SerialName("additions_count")
//    val additionsCount: Int,
//    @SerialName("alternative_names")
//    val alternativeNames: List<String>,
    @SerialName("background_image")
    val backgroundImage: String,
//    @SerialName("background_image_additional")
//    val backgroundImageAdditional: String,
//    @SerialName("clip")
//    val clip: String?,
//    @SerialName("creators_count")
//    val creatorsCount: Int,
    @SerialName("description")
    val description: String,
    @SerialName("description_raw")
    val descriptionRaw: String,
//    @SerialName("developers")
//    val developers: List<Developer>,
//    @SerialName("dominant_color")
//    val dominantColor: String,
//    @SerialName("esrb_rating")
//    val esrbRating: EsrbRating,
//    @SerialName("game_series_count")
//    val gameSeriesCount: Int,
//    @SerialName("genres")
//    val genres: List<Genre>,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("metacritic")
//    val metacritic: Int,
//    @SerialName("metacritic_platforms")
//    val metacriticPlatforms: List<MetacriticPlatform>,
//    @SerialName("metacritic_url")
//    val metacriticUrl: String,
//    @SerialName("movies_count")
//    val moviesCount: Int,
    @SerialName("name")
    val name: String,
//    @SerialName("name_original")
//    val nameOriginal: String,
//    @SerialName("parent_achievements_count")
//    val parentAchievementsCount: Int,
//    @SerialName("parent_platforms")
//    val parentPlatforms: List<ParentPlatform>,
//    @SerialName("parents_count")
//    val parentsCount: Int,
//    @SerialName("platforms")
//    val platforms: List<PlatformXX>,
//    @SerialName("playtime")
//    val playtime: Int,
//    @SerialName("publishers")
//    val publishers: List<Publisher>,
//    @SerialName("rating")
//    val rating: Double,
//    @SerialName("rating_top")
//    val ratingTop: Int,
//    @SerialName("ratings")
//    val ratings: List<Rating>,
//    @SerialName("ratings_count")
//    val ratingsCount: Int,
//    @SerialName("reactions")
//    val reactions: Reactions,
//    @SerialName("reddit_count")
//    val redditCount: Int,
//    @SerialName("reddit_description")
//    val redditDescription: String,
//    @SerialName("reddit_logo")
//    val redditLogo: String,
//    @SerialName("reddit_name")
//    val redditName: String,
//    @SerialName("reddit_url")
//    val redditUrl: String,
//    @SerialName("released")
//    val released: String,
//    @SerialName("reviews_count")
//    val reviewsCount: Int,
//    @SerialName("reviews_text_count")
//    val reviewsTextCount: Int,
//    @SerialName("saturated_color")
//    val saturatedColor: String,
//    @SerialName("screenshots_count")
//    val screenshotsCount: Int,
//    @SerialName("slug")
//    val slug: String,
//    @SerialName("stores")
//    val stores: List<Store>,
//    @SerialName("suggestions_count")
//    val suggestionsCount: Int,
//    @SerialName("tags")
//    val tags: List<Tag>,
//    @SerialName("tba")
//    val tba: Boolean,
//    @SerialName("twitch_count")
//    val twitchCount: Int,
//    @SerialName("updated")
//    val updated: String,
//    @SerialName("user_game")
//    val userGame: Any,
//    @SerialName("website")
//    val website: String,
//    @SerialName("youtube_count")
//    val youtubeCount: Int
)

//data class AddedByStatus(
//    @SerialName("beaten")
//    val beaten: Int,
//    @SerialName("dropped")
//    val dropped: Int,
//    @SerialName("owned")
//    val owned: Int,
//    @SerialName("playing")
//    val playing: Int,
//    @SerialName("toplay")
//    val toplay: Int,
//    @SerialName("yet")
//    val yet: Int
//)
//
//data class Developer(
//    @SerialName("games_count")
//    val gamesCount: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("image_background")
//    val imageBackground: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class EsrbRating(
//    @SerialName("id")
//    val id: Int,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class Genre(
//    @SerialName("games_count")
//    val gamesCount: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("image_background")
//    val imageBackground: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class MetacriticPlatform(
//    @SerialName("metascore")
//    val metascore: Int,
//    @SerialName("platform")
//    val platform: Platform,
//    @SerialName("url")
//    val url: String
//)
//
//data class ParentPlatform(
//    @SerialName("platform")
//    val platform: PlatformX
//)
//
//data class PlatformXX(
//    @SerialName("platform")
//    val platform: PlatformXXX,
//    @SerialName("released_at")
//    val releasedAt: String,
//    @SerialName("requirements")
//    val requirements: Requirements
//)
//
//data class Publisher(
//    @SerialName("games_count")
//    val gamesCount: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("image_background")
//    val imageBackground: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class Rating(
//    @SerialName("count")
//    val count: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("percent")
//    val percent: Double,
//    @SerialName("title")
//    val title: String
//)
//
//data class Reactions(
//    @SerialName("1")
//    val x1: Int,
//    @SerialName("10")
//    val x10: Int,
//    @SerialName("11")
//    val x11: Int,
//    @SerialName("12")
//    val x12: Int,
//    @SerialName("14")
//    val x14: Int,
//    @SerialName("15")
//    val x15: Int,
//    @SerialName("16")
//    val x16: Int,
//    @SerialName("18")
//    val x18: Int,
//    @SerialName("2")
//    val x2: Int,
//    @SerialName("20")
//    val x20: Int,
//    @SerialName("21")
//    val x21: Int,
//    @SerialName("3")
//    val x3: Int,
//    @SerialName("4")
//    val x4: Int,
//    @SerialName("5")
//    val x5: Int,
//    @SerialName("6")
//    val x6: Int,
//    @SerialName("7")
//    val x7: Int,
//    @SerialName("8")
//    val x8: Int,
//    @SerialName("9")
//    val x9: Int
//)
//
//data class Store(
//    @SerialName("id")
//    val id: Int,
//    @SerialName("store")
//    val store: StoreX,
//    @SerialName("url")
//    val url: String
//)
//
//data class Tag(
//    @SerialName("games_count")
//    val gamesCount: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("image_background")
//    val imageBackground: String,
//    @SerialName("language")
//    val language: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class Platform(
//    @SerialName("name")
//    val name: String,
//    @SerialName("platform")
//    val platform: Int,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class PlatformX(
//    @SerialName("id")
//    val id: Int,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)
//
//data class PlatformXXX(
//    @SerialName("games_count")
//    val gamesCount: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("image")
//    val image: Any,
//    @SerialName("image_background")
//    val imageBackground: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String,
//    @SerialName("year_end")
//    val yearEnd: Any,
//    @SerialName("year_start")
//    val yearStart: Any
//)
//
//data class Requirements(
//    @SerialName("minimum")
//    val minimum: String,
//    @SerialName("recommended")
//    val recommended: String
//)
//
//data class StoreX(
//    @SerialName("domain")
//    val domain: String,
//    @SerialName("games_count")
//    val gamesCount: Int,
//    @SerialName("id")
//    val id: Int,
//    @SerialName("image_background")
//    val imageBackground: String,
//    @SerialName("name")
//    val name: String,
//    @SerialName("slug")
//    val slug: String
//)