package com.poc.rent_a_movie.controller

import com.poc.rent_a_movie.domain.MovieDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/movies")
class MovieController {

    @PostMapping
    fun createMovie(movieDTO: MovieDTO){

    }
}