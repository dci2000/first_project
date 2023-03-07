package com.example.first_project.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    //Example of the CRUDRepository
    //CRUDRepository interface provides generic CRUD operations on a repository for a specific type
    // the return value is generic Optional<T> which is a container object which may or may not contain a non null value
    // if a value is present, is present returns true and get returns the value.
    //when adding a new player we can use findByEmail method to check if the email is already present in the repository
    @Query("SELECT s FROM Player s WHERE s.email = ?1")
    Optional<Player> findPlayerByEmail(String email);

}
