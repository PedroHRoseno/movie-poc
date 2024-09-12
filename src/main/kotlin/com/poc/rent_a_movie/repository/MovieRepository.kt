package com.poc.rent_a_movie.repository

import com.poc.rent_a_movie.domain.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository: CrudRepository<Movie, Long>