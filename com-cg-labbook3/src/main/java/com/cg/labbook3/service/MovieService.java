package com.cg.labbook3.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.labbook3.movie.Movie;
import com.cg.labbook3.repository.MovieJpaRepository;

@Service
public class MovieService {
	@Autowired
	MovieJpaRepository repository;
	
	public List<Movie> getAllMovies(){
		System.out.println("Get all employees");
		List<Movie> movie = new ArrayList<Movie>();
       	//repository.findAll().forEach(movie1 -> movie.add(movie1));
		repository.findAll().forEach(movie1 -> movie.add(movie1));
		return movie;
	}
	
	public Movie getMovieByName(String movieName)
	{
		System.out.println("Get trainee by ID");
		return repository.findByMovieName(movieName);
	}
	@Transactional
	public void delete(String movieName) {
 		System.out.println("Delete movie");
       	repository.deleteByMovieName(movieName);
 	}
	
	public void saveOrUpdate(Movie movie) {
 		System.out.println("Save Or Update movie");
       	repository.save(movie);
 	}
	
	public void update(Movie movie,String movieName) {
 		System.out.println("Update movie");
       	repository.save(movie);
 	}
	
	  public List<Movie> getMovieByGenre(String genre) {
	  System.out.println("Get trainee by ID"); 
	  return repository.findByMovieGenre(genre); 
	  }
	 
	
}
