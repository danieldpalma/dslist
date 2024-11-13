package com.danieldpalma.demo.repositories;

import com.danieldpalma.demo.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
