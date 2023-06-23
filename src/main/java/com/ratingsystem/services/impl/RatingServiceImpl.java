/**
 * 
 */
package com.ratingsystem.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingsystem.entities.Rating;
import com.ratingsystem.repository.RatingRepository;
import com.ratingsystem.services.RatingService;

/**
 * @author vijay
 */
@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByTeacherId(String teacherId) {
		
		return ratingRepository.findByTeacherId(teacherId);
	}

}
