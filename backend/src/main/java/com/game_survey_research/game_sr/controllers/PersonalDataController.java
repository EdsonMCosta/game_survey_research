package com.game_survey_research.game_sr.controllers;

import com.game_survey_research.game_sr.dtos.PersonalDataInsertDTO;
import com.game_survey_research.game_sr.dtos.RecordDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * PersonalDataController
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
public interface PersonalDataController {

    ResponseEntity<RecordDTO> insert(@RequestBody PersonalDataInsertDTO insertDTO);

    ResponseEntity<Page<RecordDTO>> getAll(@RequestParam(value = "min", defaultValue = "") String min,
                                          @RequestParam(value = "max", defaultValue = "") String max,
                                          @RequestParam(value = "page", defaultValue = "0") Integer page,
                                          @RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
                                          @RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
                                          @RequestParam(value = "direction", defaultValue = "DESC") String direction);
}
