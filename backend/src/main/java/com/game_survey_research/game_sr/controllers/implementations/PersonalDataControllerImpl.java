package com.game_survey_research.game_sr.controllers.implementations;

import com.game_survey_research.game_sr.controllers.PersonalDataController;
import com.game_survey_research.game_sr.dtos.PersonalDataInsertDTO;
import com.game_survey_research.game_sr.dtos.RecordDTO;
import com.game_survey_research.game_sr.services.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PersonalDataControllerImpl
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
@RestController
@RequestMapping(value = "/records")
public class PersonalDataControllerImpl implements PersonalDataController {

    @Autowired
    private PersonalDataService personalDataService;

    @Override
    @PostMapping
    public ResponseEntity<RecordDTO> insert(PersonalDataInsertDTO insertDTO) {
        final RecordDTO recordDTO = personalDataService.insert(insertDTO);

        return ResponseEntity.ok(recordDTO);
    }
}
