package com.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingsdataservice.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("{movieId}")
	public Rating getrating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}

}
