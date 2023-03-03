package com.example.first_project.player;

import java.util.List;

public class PlayerService {
    public List<Player> getPlayers(){
        return List.of(
                new Player(
                        1L,
                        "Petr",
                        "Cihak",
                        "123456789",
                        "email.testemail@gmail.com"
                )
        );
    }
}
