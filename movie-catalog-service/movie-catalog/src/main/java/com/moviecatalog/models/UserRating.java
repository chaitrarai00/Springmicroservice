package com.moviecatalog.models;

import java.util.List;

public class UserRating {
	
	private List<Rating> rating;

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}

	public UserRating(List<Rating> rating) {
		super();
		this.rating = rating;
	}

	public UserRating() {
		super();
	}
	
	
}
