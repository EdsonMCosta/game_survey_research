package com.game_survey_research.game_sr.controllers.implementations;

import com.game_survey_research.game_sr.controllers.PersonalDataController;
import com.game_survey_research.game_sr.dtos.PersonalDataInsertDTO;
import com.game_survey_research.game_sr.dtos.RecordDTO;
import com.game_survey_research.game_sr.services.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

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
    public ResponseEntity<RecordDTO> insert(@RequestBody PersonalDataInsertDTO insertDTO) {
        final RecordDTO recordDTO = personalDataService.insert(insertDTO);

        return ResponseEntity.ok(recordDTO);
    }

    @Override
    @GetMapping
    public ResponseEntity<Page<RecordDTO>> getAll(@RequestParam(value = "min", defaultValue = "") String min,
                                                  @RequestParam(value = "max", defaultValue = "") String max,
                                                  @RequestParam(value = "page", defaultValue = "0") Integer page,
                                                  @RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
                                                  @RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
                                                  @RequestParam(value = "direction", defaultValue = "DESC") String direction) {

        Instant minDate = ("".equals(min)) ? null : Instant.parse(min);
        Instant maxDate = ("".equals(max)) ? null : Instant.parse(max);

        if (linesPerPage == 0) {
            linesPerPage = Integer.MAX_VALUE;
        }

        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);

        final Page<RecordDTO> byMoment = personalDataService.findByMoment(minDate, maxDate, pageRequest);

        return ResponseEntity.ok(byMoment);
    }

}
