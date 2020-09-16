package com.game_survey_research.game_sr.services;

import com.game_survey_research.game_sr.dtos.PersonalDataInsertDTO;
import com.game_survey_research.game_sr.dtos.RecordDTO;
import com.game_survey_research.game_sr.entities.Game;
import com.game_survey_research.game_sr.entities.PersonalData;
import com.game_survey_research.game_sr.repositories.GameRepository;
import com.game_survey_research.game_sr.repositories.PersonalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

/**
 * RecordService
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
@Service
public class PersonalDataService {

    @Autowired
    private PersonalDataRepository personalDataRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(PersonalDataInsertDTO dataInsertDTO){
        final PersonalData personalData = new PersonalData();

        personalData.setName(dataInsertDTO.getName());
        personalData.setAge(dataInsertDTO.getAge());
        personalData.setMoment(Instant.now());

        final Game game = gameRepository.getOne(dataInsertDTO.getGameId());
        personalData.setGame(game);

        final PersonalData data = personalDataRepository.save(personalData);

        return new RecordDTO(data);
    }
}
