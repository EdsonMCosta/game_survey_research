package com.game_survey_research.game_sr.controllers;

import com.game_survey_research.game_sr.dtos.PersonalDataInsertDTO;
import com.game_survey_research.game_sr.dtos.RecordDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * PersonalDataController
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
public interface PersonalDataController {

    ResponseEntity<RecordDTO> insert(@RequestBody PersonalDataInsertDTO insertDTO);
}
