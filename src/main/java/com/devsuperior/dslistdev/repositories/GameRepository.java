package com.devsuperior.dslistdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistdev.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
