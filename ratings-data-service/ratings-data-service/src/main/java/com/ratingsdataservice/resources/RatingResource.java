package com.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingsdataservice.model.Rating;
import com.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("user/{userId}")
	public UserRating getRating(@PathVariable("userId") String movieId) {
		return new UserRating(Arrays.asList(
				new Rating("2034", 4),
				new Rating("2035",5)));
	}

}
