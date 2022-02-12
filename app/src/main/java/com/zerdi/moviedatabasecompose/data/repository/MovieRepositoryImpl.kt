package com.zerdi.moviedatabasecompose.data.repository

import com.zerdi.moviedatabasecompose.data.remote.MovieAPI
import com.zerdi.moviedatabasecompose.data.remote.dto.MovieDetailDto
import com.zerdi.moviedatabasecompose.data.remote.dto.MoviesDto
import com.zerdi.moviedatabasecompose.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }
    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}