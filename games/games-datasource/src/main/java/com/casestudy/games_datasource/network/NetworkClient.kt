package com.casestudy.games_datasource.network

import com.casestudy.games_datasource.network.service.GamesService
import com.casestudy.games_datasource.network.service.GamesServiceImpl
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*

object NetworkClientFactory {
    fun build(): GamesService {
        return GamesServiceImpl(
            httpClient = HttpClient(Android) {
                install(JsonFeature) {
                    serializer = KotlinxSerializer(
                        kotlinx.serialization.json.Json  {
                            ignoreUnknownKeys = true // if the server sends extra fields, ignore them
                        }
                    )
                }
            }
        )
    }
}