package com.casestudy.games_interactors

import com.casestudy.games_domain.Games
import com.casestudy.core.DataState
import com.casestudy.core.ProgressBarState
import com.casestudy.games_datasource.network.service.GamesService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class GetAllGames(
//    private val cache: GameCache,
    private val service: GamesService,
) {

    fun execute(pageSize: Int , PageNum: Int): Flow<DataState<List<Games>>> = flow {
        try {
            emit(DataState.Loading(ProgressBarState.Loading))

            val allGames: List<Games> = try { // catch network exceptions
                service.getAllGames(pageSize, PageNum)
            }catch (e: Exception){
                e.printStackTrace() // log to crashlytics?
                emit(DataState.Error(null))
                listOf()
            }

            // cache the network data
//            cache.insert(allGames)

            // emit data from cache
//            val cachedGames = cache.selectAll()

//            emit(DataState.Data(cachedGames))
        }catch (e: Exception){
            e.printStackTrace()
            emit(DataState.Error(null))

        }
        finally {
            emit(DataState.Loading(ProgressBarState.Idle))
        }
    }
}




