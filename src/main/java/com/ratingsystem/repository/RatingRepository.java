/**
 * 
 */
package com.ratingsystem.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ratingsystem.entities.Rating;

/**
 * @author vijay
 */
public interface RatingRepository extends MongoRepository<Rating, String> {

	List<Rating> findByUserId(String userId);
	
	List<Rating> findByTeacherId(String teacherId);
}
