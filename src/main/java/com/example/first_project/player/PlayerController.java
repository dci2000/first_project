package com.example.first_project.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    @GetMapping()
    public List<Player> hello(){
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
