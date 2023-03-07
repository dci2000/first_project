package com.example.first_project.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }


    //==========GET MAPPINGS==========\\

    @GetMapping()
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }


    @GetMapping("/email")
    public Player findPlayerByEmail(@RequestParam(name = "email") String email){
        return playerService.findPlayerByEmail(email);
    }

    @GetMapping("/id")
    public Optional<Player> findPlayerById(@RequestParam(name = "id") Long id){
        return playerService.findPlayerById(id);
    }


    //==========POST MAPPINGS==========\\

    @PostMapping("player")
    public void addPlayer(@RequestBody Player player){
        playerService.addNewPlayer(player);
    }

    //==========DELETE MAPPINGS==========\\

    @DeleteMapping("/id")
    public boolean  deletePlayer(@RequestParam(name = "id") Long id){
        return playerService.deletePlayer(id);
    }
    @DeleteMapping("/email")
    public boolean deletePlayerByEmail(@RequestParam(name = "email") String email){
        return playerService.deletePlayerByEmail(email);
    }
}

