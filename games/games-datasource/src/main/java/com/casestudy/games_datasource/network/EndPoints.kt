package com.casestudy.games_datasource.network

object EndPoints {

//    https://api.rawg.io/api/games?key=75705e3ed52f4bc29fb37c536b5f09a7&page_size=10&page=2
//    https://api.rawg.io/api/games/3498?key=75705e3ed52f4bc29fb37c536b5f09a7

    const val BASE_URL = "https://api.rawg.io/api/"
    const val API_KEY = "75705e3ed52f4bc29fb37c536b5f09a7"
    const val ALL_GAMES = "$BASE_URL/games?key=$API_KEY"
    const val GAME_DETAILS = "$BASE_URL/games/"

}