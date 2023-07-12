package com.intensicaojavaspring.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.intensicaojavaspring.demo.dto.GameDTO;
import com.intensicaojavaspring.demo.dto.GameMinDTO;
import com.intensicaojavaspring.demo.entities.Game;
import com.intensicaojavaspring.demo.projection.GameMinProjection;
import com.intensicaojavaspring.demo.repositories.GameRepository;


@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result =  gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId){
		Game result = gameRepository.findById(gameId).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result =  gameRepository.searchByList(listId);
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
