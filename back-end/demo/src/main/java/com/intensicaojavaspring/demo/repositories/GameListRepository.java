package com.intensicaojavaspring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensicaojavaspring.demo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
