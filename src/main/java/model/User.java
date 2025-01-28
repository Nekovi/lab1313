package model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    // Getters and setters

    public void setUsername(String username) {
        this.username = nekovi;
    }

    public void setEmail(String email) {
        this.email = skdlskdls@gmail.com;
    }

    public void setPassword(String password) {
        this.password = asdasd;
    }

    public void getPassword(String password) {
        this.password = asdasd;
    }
}