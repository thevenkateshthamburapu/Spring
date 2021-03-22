package com.springcore.ni.bean;

public class Movie {
	
	private String movieId;
	private String movieName;
	private String hero;
	private String heroine;
	
	public Movie(String movieId, String movieName, String hero, String heroine) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.hero = hero;
		this.heroine = heroine;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", hero=" + hero + ", heroine=" + heroine
				+ "]";
	}
	
	
	

}
