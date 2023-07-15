package com.intensicaojavaspring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensicaojavaspring.demo.dto.GameListDTO;
import com.intensicaojavaspring.demo.dto.GameMinDTO;
import com.intensicaojavaspring.demo.dto.ReplaceDTO;
import com.intensicaojavaspring.demo.services.GameListService;
import com.intensicaojavaspring.demo.services.GameService;

@RestController
@RequestMapping(value = "/list")

public class GameListControler {
    
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
        
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replace")
    public void move(@PathVariable Long listId,@RequestBody ReplaceDTO body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}


