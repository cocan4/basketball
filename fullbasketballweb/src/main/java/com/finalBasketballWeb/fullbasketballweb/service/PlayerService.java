package com.finalBasketballWeb.fullbasketballweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalBasketballWeb.fullbasketballweb.beans.Player;
import com.finalBasketballWeb.fullbasketballweb.repo.PlayerRepo;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepo playerRepo;
	
	
	public void addPlayers(Player player) {
		playerRepo.save(player);
		
	}
	
	public void updatePlayers(Player player) {
		playerRepo.saveAndFlush(player);
	}

	public void deletePlayers(Player player) {
	playerRepo.delete(player);
}

	public List<Player> getAllPlayers(){
	return playerRepo.findAll();
}

	public Player getTeam(int id) {
		return playerRepo.getOne(id);
	}
}
