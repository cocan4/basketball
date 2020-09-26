package com.finalBasketballWeb.fullbasketballweb.testing;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.finalBasketballWeb.fullbasketballweb.beans.Player;
import com.finalBasketballWeb.fullbasketballweb.beans.Team;
import com.finalBasketballWeb.fullbasketballweb.service.PlayerService;
import com.finalBasketballWeb.fullbasketballweb.utils.ArtUtils;

@Component
public class PlayerServiceClr implements CommandLineRunner{

	@Autowired 
	private PlayerService playerService;
	
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(ArtUtils.PLAYER_SERVICE_ART);
		
		Team t1 = new Team();
		t1.setName("MIAMI-HEAT");
		Team t2 = new Team();
		t2.setName("INDIANA-PACERS");
		Team t3 = new Team();
		t3.setName("LA-LAKERS");
		Team t4 = new Team();
		t4.setName("CHICAGO-BULLS");
		Team t5 = new Team();
		
		Player p1 = new Player(1, Date.valueOf("1981,08,21"), "ray allen", "33", "basketball", "sg",t1);
		Player p2 = new Player(2,  Date.valueOf("1981,08,21"), "reggie miller", "basketball", "basketball", "sg",t2);
		Player p3 = new Player(3, Date.valueOf("1981,06,21"), "koby bryent", "8", "basketball", "sg",t3);
		Player p4 = new Player(4, Date.valueOf("1981,06,21"), "scotty pippen", "33", "basketball", "sf",t5);
		Player p5 = new Player(5, Date.valueOf("1981,06,21"), "shaquile oniel", "32",  "basketball", "c",t3);
		Player p6 = new Player(6, Date.valueOf("1981,06,21"), "michael jordan", "23",  "basketball", "sg",t4);
		Player p7 = new Player(7, Date.valueOf("1981,06,21"), "dwayne wade", "3",  "basketball", "sg", t1);
		Player p8 = new Player(8, Date.valueOf("1981,06,21"), "magic johnson", "32",  "basketball","pg", t3);
		Player p9 = new Player(9, Date.valueOf("1981,06,21"), "chris bosh", "1",  "basketball", "pf",t1);
		Player p10 = new Player(10, Date.valueOf("1981,06,21"), "jalen rose", "6",  "basketball", "sf",t2);
		Player p11= new Player(11, Date.valueOf("1981,06,21"), "lebron james", "23",  "basketball", "sf",t1);
		
		System.out.println("add players");
		playerService.addPlayers(p1);
		playerService.addPlayers(p2);
		playerService.addPlayers(p3);
		playerService.addPlayers(p4);
		playerService.addPlayers(p5);
		playerService.addPlayers(p6);
		playerService.addPlayers(p7);
		playerService.addPlayers(p8);
		playerService.addPlayers(p9);
		playerService.addPlayers(p10);
		playerService.addPlayers(p11);
		
		System.out.println(playerService.getAllPlayers());

		
	}

	
	
	
}
