package com.example.first_project.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;
    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGames(){return gameRepository.findAll();}

    public void addNewGame(Game game){
//        System.out.println(game);
        gameRepository.save(game);
    }
}
