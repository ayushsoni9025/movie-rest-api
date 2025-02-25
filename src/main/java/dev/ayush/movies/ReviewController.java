package dev.ayush.movies;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
	@Autowired
	private ReviewService service;
	
	@PostMapping
	public ResponseEntity<Reviews> createReview(@RequestBody Map<String,String> payLoad){
		return new ResponseEntity<Reviews>(service.createReview(payLoad.get("reviewBody"), payLoad.get("imdbId")), HttpStatus.CREATED);
	}
}
