package com.example.first_project.game;


import com.example.first_project.player.Player;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Game")
public class Game {
    @Id
    @SequenceGenerator(
            name = "game_sequence",
            sequenceName = "game_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "game_sequence"
    )
    private Long id;
    private String name;
    private String result;

    private String start_time;
    private String end_time;

    @ManyToMany(mappedBy = "games")
    private Set<Player> players;


    public Game(Long id, String name, String result, String start, String end) {
        this.id = id;
        this.name = name;
        this.result = result;
        this.start_time = start;
        this.end_time = end;

    }

    public Game(String name, String result, String start, String end) {
        this.name = name;
        this.result = result;
        this.start_time = start;
        this.end_time = end;

    }

    public Game() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

//    public Set<Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(Set<Player> players) {
//        this.players = players;
//    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", result='" + result + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", players=" + players +
                '}';
    }
}
