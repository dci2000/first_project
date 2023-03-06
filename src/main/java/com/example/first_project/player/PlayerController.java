package com.example.first_project.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("displayAll")
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @PostMapping("add")
    public void addPlayer(@RequestBody Player player){
        playerService.addNewPlayer(player);
    }
}
