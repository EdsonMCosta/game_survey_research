package com.game_survey_research.game_sr.repositories;

import com.game_survey_research.game_sr.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GenreRepository
 *
 * @author : Edson Costa
 * @since : 15/09/2020
 **/
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
