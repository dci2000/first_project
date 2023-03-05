package com.example.first_project.game;


import com.example.first_project.player.Player;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "GAME")
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String result;

    private String start;
    private String end;

    @ManyToMany(mappedBy = "games")
    private Set<Player> players;


    public Game(Long id, String name, String result, String start, String end) {
        this.id = id;
        this.name = name;
        this.result = result;
        this.start = start;
        this.end = end;

    }

    public Game(String name, String result, String start, String end) {
        this.name = name;
        this.result = result;
        this.start = start;
        this.end = end;

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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", players=" + players +
                '}';
    }
}
