package com.game_survey_research.game_sr.repositories;

import com.game_survey_research.game_sr.entities.PersonalData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Instant;

/**
 * PersonalDataRepository
 *
 * @author : Edson Costa
 * @since : 15/09/2020
 **/
public interface PersonalDataRepository extends JpaRepository<PersonalData, Long> {

    @Query("SELECT obj FROM PersonalData obj WHERE " +
            "(coalesce(:min, null) IS NULL OR obj.moment >= :min) AND " +
            "(coalesce(:max, null) IS NULL OR obj.moment <= :max)")
    Page<PersonalData> findByMoments(Instant min, Instant max, Pageable pageable);
}
