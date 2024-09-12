package com.poc.rent_a_movie.service

import com.poc.rent_a_movie.domain.Movie
import com.poc.rent_a_movie.domain.MovieDTO
import com.poc.rent_a_movie.repository.MovieRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MovieService(
    val movieRepository: MovieRepository
) {

    @Transactional
    fun saveMovie(movieDTO: MovieDTO){

        /// CRIAR FUNCAO QUE BUSCA A CAPA DO FILME
        val movie: Movie = Movie(movieDTO.title, movieDTO.year, movieDTO.director, "")
        movieRepository.save(movie)
    }

}