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

    @GetMapping("/findAll")
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @PostMapping("add")
    public void addPlayer(@RequestBody Player player){
        playerService.addNewPlayer(player);
    }

    @GetMapping("/{email}")
    public Player findPlayerByEmail(@PathVariable(name = "email") String email){
        return playerService.findPlayerByEmail(email);
    }

    @GetMapping("findById")
    public Player findPlayerById(){
        return null;
    }

    @DeleteMapping("/remove/{id}")
    public boolean  deletePlayer(@PathVariable("id") Long id){
        return playerService.deletePlayer(id);
    }
    @DeleteMapping("/removeByEmail/{email}")
    public boolean deletePlayerByEmail(@PathVariable("email") String email){
        return playerService.deletePlayerByEmail(email);
    }
}

