package com.zerdi.moviedatabasecompose.domain.repository

import com.zerdi.moviedatabasecompose.data.remote.dto.MovieDetailDto
import com.zerdi.moviedatabasecompose.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto

    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto


}