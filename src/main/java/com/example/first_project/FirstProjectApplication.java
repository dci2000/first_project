package com.example.first_project;
import com.example.first_project.game.Game;
import com.example.first_project.game.GameRepository;
import com.example.first_project.player.Player;
import com.example.first_project.player.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(GameRepository gameRepository, PlayerRepository playerRepository){
		return args -> {
			Game chess = new Game(
					"chess",
					"won",
					"01",
					"05"
			);
			Player klara = new Player(
					"klara",
					"lachm",
					"80576123",
					"klara.lachm@gmail.com"

			);
			Player boris = new Player(
					"Boris",
					"nurmanekov",
					"123456789",
					"portsmouth.university@gmail.com"

			);
			Player daniel = new Player(
					"Daniel",
					"cihak",
					"235476012",
					"daniel.cihak@gmail.com"

			);
			gameRepository.save(chess);
			playerRepository.save(klara);
			playerRepository.save(boris);
			playerRepository.save(daniel);

		};
	}


}


