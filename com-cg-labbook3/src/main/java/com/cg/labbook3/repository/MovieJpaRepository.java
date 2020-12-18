package com.cg.labbook3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.labbook3.movie.Movie;

public interface MovieJpaRepository extends CrudRepository<Movie, Integer>{

	Movie findByMovieName(String movieName);

	void deleteByMovieName(String movieName);

	List<Movie> findByMovieGenre(String genre);

}
