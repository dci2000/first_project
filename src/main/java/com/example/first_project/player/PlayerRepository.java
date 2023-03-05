package com.example.first_project.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    //when adding a new player we can use findByEmail method to check if the email is already present in the repository
    @Query("SELECT s FROM Player s WHERE s.email = ?1")
    Optional<Player> findByEmail(String email);
}
