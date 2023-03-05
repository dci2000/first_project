package com.example.first_project.player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfig {
    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repository){
        return args -> {
            Player Petr = new Player(
                    "Petr",
                    "Cihak",
                    "123456789",
                    "email.testemail@gmail.com"
            );
            Player Daniel = new Player(
                    "Daniel",
                    "Heim",
                    "777444507",
                    "email.danielHeim@gmail.com"
            );
            repository.saveAll(
                    List.of(Daniel, Petr)
            );

        };

    }
}
