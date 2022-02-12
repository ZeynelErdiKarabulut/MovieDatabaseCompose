package com.zerdi.moviedatabasecompose.presentation.movies

import com.zerdi.moviedatabasecompose.domain.model.Movie

data class MoviesState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "squid"
)