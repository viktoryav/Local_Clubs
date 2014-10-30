package com.pluralsight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Club;
import com.pluralsight.service.ClubService;

@Controller
@SessionAttributes("club")
public class ChildrenController {
	@Autowired
	private ClubService clubService;
	
	@RequestMapping(value = "children", method = RequestMethod.GET)
	public String addGoal(Model model) {
		//.createClub();
		Club club = clubService.getClubInfo(4);
		model.addAttribute("club", club);
		return "childrenList";
	}
}
