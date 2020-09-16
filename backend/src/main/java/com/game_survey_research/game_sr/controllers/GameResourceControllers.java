package com.game_survey_research.game_sr.controllers;

import com.game_survey_research.game_sr.dtos.GameDTO;
import com.game_survey_research.game_sr.entities.Game;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * GameResourcesControllers
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
public interface GameResourceControllers {

    ResponseEntity<List<GameDTO>> findAll();
}
