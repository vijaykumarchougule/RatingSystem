/**
 * 
 */
package com.ratingsystem.services;

import java.util.List;

import com.ratingsystem.entities.Rating;

/**
 * @author vijay
 */
public interface RatingService {

	Rating create(Rating rating);
	
	List<Rating> getRatings();
	
	List<Rating> getRatingByUserId(String userId);
	
	List<Rating> getRatingByTeacherId(String teacherId);
}
