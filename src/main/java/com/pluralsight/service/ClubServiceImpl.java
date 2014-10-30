package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Club;
import com.pluralsight.repository.ClubRepository;
@Service("clubService")
public class ClubServiceImpl implements ClubService {
	@Autowired
	private ClubRepository clubRepository;
	
	public Club getClubInfo(int id) {
		return clubRepository.getClub(id);
	}
	
	@Transactional
	public void createClub() {
		clubRepository.tempCreateClub();
	}

}
