package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Child;
import com.pluralsight.model.Club;
import com.pluralsight.model.ContactDetails;

@Repository("clubRepository")
public class ClubRepositoryImpl implements ClubRepository {
	@PersistenceContext
	private EntityManager em;
	
	public void tempCreateClub()
	{
		Club club = new Club();
		Child child = new Child(club);
		ContactDetails details = new ContactDetails();
		details.setFirstName("Yuli");
		details.setLastName("Lago");
		child.setContactDetails(details);
		club.addChild(child);
		
		em.persist(club);
		em.flush();
	}
	
	public Club getClub(int id) {
		Club club = em.find(Club.class, id);
		return club;
	}

}
