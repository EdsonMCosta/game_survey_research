package com.game_survey_research.game_sr.repositories;

import com.game_survey_research.game_sr.entities.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PersonalDataRepository
 *
 * @author : Edson Costa
 * @since : 15/09/2020
 **/
public interface PersonalDataRepository extends JpaRepository<PersonalData, Long> {
}
