package com.example.first_project;
import com.example.first_project.game.Game;
import com.example.first_project.game.GameRepository;
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
	CommandLineRunner commandLineRunner(GameRepository gameRepository){
		return args -> {
			Game chess = new Game(
					"chess",
					"won",
					"01",
					"05"
			);
			gameRepository.save(chess);

		};
	}


}


