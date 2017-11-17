package com.example.demo.model;

import javax.persistence.*;

/**
 * Created by Nyansus on 17.11.2017.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
