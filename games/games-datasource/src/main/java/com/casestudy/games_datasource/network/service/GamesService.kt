package com.casestudy.games_datasource.network.service

import com.casestudy.games_domain.Games

interface GamesService {

    suspend fun getAllGames(pageSize: Int , PageNum: Int): List<Games>


}