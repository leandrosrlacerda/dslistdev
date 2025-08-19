package com.devsuperior.dslistdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistdev.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

