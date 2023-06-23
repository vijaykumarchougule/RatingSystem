/**
 * 
 */
package com.ratingsystem.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vijay
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("user_ratings")
public class Rating {

	@Id
	private String ratingId;
	
	private String userId;
	
	private String teacherId;
	
	private int rating;
	
	private String feedback;
}
