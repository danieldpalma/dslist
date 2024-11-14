package com.danieldpalma.dslist.repositories;

import com.danieldpalma.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
