package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {
	
	@PersistenceContext()
	private EntityManager em;
 
	public Exercise save(Exercise exercise) {
		em.persist(exercise);
		em.flush();
		return exercise;
	}

}
