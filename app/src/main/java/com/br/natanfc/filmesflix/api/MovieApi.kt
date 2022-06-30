package com.br.natanfc.filmesflix.api

import com.br.natanfc.filmesflix.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    @GET("flilmesflix.json")
    fun getAllMovies(): Call<List<Movie>>


}