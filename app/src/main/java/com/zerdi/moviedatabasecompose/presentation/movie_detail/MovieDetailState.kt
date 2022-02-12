package com.zerdi.moviedatabasecompose.presentation.movie_detail

import com.zerdi.moviedatabasecompose.domain.model.Movie
import com.zerdi.moviedatabasecompose.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)