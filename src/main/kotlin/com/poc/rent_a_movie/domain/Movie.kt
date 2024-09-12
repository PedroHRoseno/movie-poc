package com.poc.rent_a_movie.domain

import org.springframework.data.annotation.Id

data class Movie(
                @Id val id: Long,
                val title: String?,
                val year: Int?,
                val director: String?,
                val cover: String?)
