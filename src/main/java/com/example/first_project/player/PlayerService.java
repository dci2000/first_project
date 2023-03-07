package com.example.first_project.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



//BUSINESS LOGIC
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }
    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    public void addNewPlayer(Player player) {
        playerRepository.save(player);
    }

    public boolean deletePlayer(Long id){
        if(playerRepository.findById(id).isPresent()){
            playerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean deletePlayerByEmail(String email){
        List<Player> all = playerRepository.findAll();
        for(int i = 0; i < playerRepository.count(); i ++){
            Player current = all.get(i);
            if(current.getEmail().equals(email)){
                playerRepository.delete(current);
                return true;
            }
        }
        return false;

    }

    public Player findPlayerByEmail(String email){
        List<Player> all = playerRepository.findAll();
        for(int i = 0; i < playerRepository.count(); i ++){
            Player current = all.get(i);
            if(current.getEmail().equals(email)){
                return current;
            }
        }
        return null;

    }


}
