package com.game_survey_research.game_sr.controllers.implementations;

import com.game_survey_research.game_sr.controllers.GameResourceControllers;
import com.game_survey_research.game_sr.dtos.GameDTO;
import com.game_survey_research.game_sr.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * GameResourceControllersImpl
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
@RestController
@RequestMapping("/games")
public class GameResourceControllersImpl implements GameResourceControllers {

    @Autowired
    private GameService gameService;

    @Override
    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        final List<GameDTO> listAll = gameService.findAll();
        return ResponseEntity.ok(listAll);
    }
}
