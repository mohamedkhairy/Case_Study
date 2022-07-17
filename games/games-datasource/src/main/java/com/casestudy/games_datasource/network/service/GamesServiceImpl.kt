package com.casestudy.games_datasource.network.service

import com.casestudy.games_domain.Games
import com.casestudy.games_datasource.network.EndPoints
import com.casestudy.games_datasource.network.model.GamesDto
import com.casestudy.games_datasource.network.model.mappingToGames
import io.ktor.client.*
import io.ktor.client.request.*

class GamesServiceImpl(
    private val httpClient: HttpClient,
): GamesService {

    override suspend fun getAllGames(pageSize: Int , PageNum: Int): List<Games> {
        return httpClient.get<GamesDto> {
            url("${EndPoints.ALL_GAMES}&page_size=$pageSize&page=$PageNum")
        }.results.mappingToGames()
    }
}