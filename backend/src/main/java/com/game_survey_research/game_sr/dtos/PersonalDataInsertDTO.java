package com.game_survey_research.game_sr.dtos;

import java.io.Serializable;

/**
 * PersonalDataInsertDTO
 *
 * @author : Edson Costa
 * @since : 16/09/2020
 **/
public class PersonalDataInsertDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private Long gameId;

    public PersonalDataInsertDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}
