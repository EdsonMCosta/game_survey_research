package com.game_survey_research.game_sr.services;

import com.game_survey_research.game_sr.dtos.GameDTO;
import com.game_survey_research.game_sr.entities.Game;
import com.game_survey_research.game_sr.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * GameService
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll(){
        final List<Game> list = gameRepository.findAll();
        return list
                .stream()
                .map(game -> new GameDTO(game))
                .collect(Collectors.toList());
    }
}
