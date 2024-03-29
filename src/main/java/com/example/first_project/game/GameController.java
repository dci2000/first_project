package com.example.first_project.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/game")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;

    }

    @GetMapping("displayAll")
    public List<Game> getGames(){
        return gameService.getGames();
    }
    @PostMapping("add")
    public void postGame(Game game){
        gameService.addNewGame(game);
    }
}
