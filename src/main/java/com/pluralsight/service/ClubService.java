package com.pluralsight.service;

import com.pluralsight.model.Club;

public interface ClubService {
	public Club getClubInfo(int id);
	public void createClub();
}
