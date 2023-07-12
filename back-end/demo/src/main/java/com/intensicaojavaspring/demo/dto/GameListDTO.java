package com.intensicaojavaspring.demo.dto;

import org.springframework.beans.BeanUtils;

import com.intensicaojavaspring.demo.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){

    }
    public GameListDTO(GameList entidy){
          BeanUtils.copyProperties(entidy, this);
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
