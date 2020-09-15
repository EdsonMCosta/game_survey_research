package com.game_survey_research.game_sr.repositories;

import com.game_survey_research.game_sr.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GameRepository
 *
 * @author : Edson Costa
 * @since : 15/09/2020
 **/
public interface GameRepository extends JpaRepository<Game, Long> {
}
