package com.intensicaojavaspring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensicaojavaspring.demo.dto.GameListDTO;

import com.intensicaojavaspring.demo.services.GameListService;



@RestController
@RequestMapping(value = "/list")

public class GameListControler {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
        
    }
}


