package com.cg.labbook3.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.labbook3.movie.Movie;
import com.cg.labbook3.service.MovieService;
@RestController
public class MovieController {
	@Autowired
	MovieService service ;
	
	@GetMapping("/Movie")
	public List<Movie> getAllMovies(){
		System.out.println("Get all employees");
		return service.getAllMovies();
	}
	
	@GetMapping("/Movie/name/{movieName}")
	public Movie getMovieByName(@PathVariable("movieName")String movieName)
	{	
		System.out.println("getMovieByName");
		return service.getMovieByName(movieName);
	}
	
	@Transactional
	@DeleteMapping("/Movie/name/{movieName}")
	private void deleteMovie(@PathVariable("movieName") String movieName) {
		System.out.println("deleteMovie");
		service.delete(movieName);
	}


	@PostMapping("/Movie")
	private String saveMovie(@RequestBody Movie movie) {
		System.out.println("saveMovie");
		service.saveOrUpdate(movie);
		return movie.getMovieName();
	}

	@PutMapping("/Movie")
	private Movie update(@RequestBody Movie movie) {
		System.out.println("update");
		service.saveOrUpdate(movie);
		return movie;
	}
	
	
	  @GetMapping("/Movie/genre/{movieGenre}") 
	  public List<Movie> getMovieByGenre(@PathVariable("movieGenre")String movieGenre) {
	  System.out.println("getMovieByName"); 
	  return service.getMovieByGenre(movieGenre); }
	 
	
}
