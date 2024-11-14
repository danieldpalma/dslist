package com.danieldpalma.dslist.repositories;

import com.danieldpalma.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
