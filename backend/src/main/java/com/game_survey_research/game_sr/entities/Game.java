package com.game_survey_research.game_sr.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.game_survey_research.game_sr.entities.enums.Platform;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Game
 *
 * @author : Edson Costa
 * @since : 15/09/2020
 **/
@Entity
@Table(name = "games")
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Platform platform;

    @ManyToOne
    @JoinColumn(name = "genre_fk_id")
    private Genre genre;

    @OneToMany(mappedBy = "game")
    private final List<PersonalData> record = new ArrayList<>();

    public Game() {
    }

    public Game(Long id, String title, Platform platform, Genre genre) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<PersonalData> getRecord() {
        return record;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
