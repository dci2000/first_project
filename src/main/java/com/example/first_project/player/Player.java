package com.example.first_project.player;

import jakarta.persistence.*;

@Entity //hibernate
@Table //table in our database
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private Long id;
    private String fName;
    private String lName;
    private String phone;
    private String email;

    //empty constructor
    public Player(){}


    //constructor for without id (db creates its own)

    public Player(String fName, String lName, String phone, String email) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
    }

    public Player(Long id, String fName, String lName, String phone, String email) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
