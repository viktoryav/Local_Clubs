package com.pluralsight.repository;

import com.pluralsight.model.Club;

public interface ClubRepository {
	public Club getClub(int id);
	public void tempCreateClub();
}
