package com.example.first_project.player;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


//BUSINESS LOGIC
@Service
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
