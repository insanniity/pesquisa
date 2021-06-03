package com.insanity.pesquisa.repositories;

import com.insanity.pesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
