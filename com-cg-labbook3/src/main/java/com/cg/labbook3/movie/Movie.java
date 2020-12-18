package com.cg.labbook3.movie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
	
	@Id
	@Column
	String movieName;
	@Column
	String movieGenre;
	@Column
	double movieRating;
	@Column
	String deletedFlag;
	
	public Movie() {}
	
	public Movie(String movieName, String movieGenre, double movieRating, String deletedFlag) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieRating = movieRating;
		this.deletedFlag = deletedFlag;
	}
	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public String getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(String deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

}
