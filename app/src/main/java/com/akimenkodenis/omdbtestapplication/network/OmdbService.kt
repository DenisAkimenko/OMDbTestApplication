package com.akimenkodenis.omdbtestapplication.network

import com.akimenkodenis.omdbtestapplication.data.OmdbMovieBaseResponse
import com.akimenkodenis.omdbtestapplication.data.OmdbMovieDetailResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OmdbService {

    @GET("?type=movie")
    suspend fun searchMovie(
        @Query(value = "s") searchTitle: String,
        @Query(value = "apiKey") apiKey: String
    ): Response<OmdbMovieBaseResponse>

    @GET("?type=movie")
    suspend fun getMovieDetails(
        @Query(value = "i") movieId: String,
        @Query(value = "apiKey") apiKey: String
    ): Response<OmdbMovieDetailResponse>
}