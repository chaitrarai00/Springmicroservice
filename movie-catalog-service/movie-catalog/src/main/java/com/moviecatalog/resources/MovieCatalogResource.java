package com.moviecatalog.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moviecatalog.models.CatalogItem;
import com.moviecatalog.models.Movie;
import com.moviecatalog.models.Rating;
import com.moviecatalog.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate resttemplate;
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		//get all rated movie id 
		UserRating ratings=resttemplate
				.getForObject("http://localhost:8083/ratingsdata/user/"+userId,UserRating.class);
		//for each rated movie call movie info service to get details
		
		return ratings.getRating().stream().map(rating->{
			Movie movie=resttemplate.getForObject("http://localhost:8081/movies/"+rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), movie.getDesc(), rating.getRating());	
					})
		.collect(Collectors.toList());
		
	}
}
