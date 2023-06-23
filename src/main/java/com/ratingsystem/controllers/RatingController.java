/**
 * 
 */
package com.ratingsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingsystem.entities.Rating;
import com.ratingsystem.services.RatingService;

/**
 * @author vijay
 */
@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService; 
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		
		return ResponseEntity.ok(ratingService.getRatings());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userID){
		
		return ResponseEntity.ok(ratingService.getRatingByUserId(userID));
	}
	
	@GetMapping("/teachers/{teacherId}")
	public ResponseEntity<List<Rating>> getRatingsByTeacherId(@PathVariable String teacherId){
		
		return ResponseEntity.ok(ratingService.getRatingByTeacherId(teacherId));
	}
	
}
