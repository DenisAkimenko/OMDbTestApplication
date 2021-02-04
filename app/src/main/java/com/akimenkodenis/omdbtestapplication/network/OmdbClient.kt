package com.akimenkodenis.omdbtestapplication.network

import com.akimenkodenis.omdbtestapplication.BuildConfig
import javax.inject.Inject

class OmdbClient @Inject constructor(private val omdbService: OmdbService) {

    suspend fun searchMovie(query: String) = omdbService.searchMovie(query, BuildConfig.API_KEY)
    suspend fun getMovieDetails(movieId: String) = omdbService.getMovieDetails(movieId, BuildConfig.API_KEY)
}