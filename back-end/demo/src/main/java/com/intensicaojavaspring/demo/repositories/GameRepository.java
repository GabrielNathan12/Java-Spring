package com.intensicaojavaspring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensicaojavaspring.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
