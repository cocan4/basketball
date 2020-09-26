package com.finalBasketballWeb.fullbasketballweb.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.finalBasketballWeb.fullbasketballweb.beans.Team;
import com.finalBasketballWeb.fullbasketballweb.service.TeamService;

@Component
public class TeamServiceClr implements CommandLineRunner{
	
	@Autowired
	private TeamService teamService;
	
	@Override
	public void run(String... args) throws Exception {
		
		Team t1 = new Team();
		t1.setName("MIAMI-HEAT");
		Team t2 = new Team();
		t2.setName("INDIANA-PACERS");
		Team t3 = new Team();
		t3.setName("LA-LAKERS");
		Team t4 = new Team();
		t4.setName("CHICAGO-BULLS");
		Team t5 = new Team();
		
		teamService.addTeam(t1);
		teamService.addTeam(t2);
		teamService.addTeam(t3);
		teamService.addTeam(t4);
		teamService.addTeam(t5);
		
		System.out.println(teamService.getAllTeams());

		
		
	}

}
