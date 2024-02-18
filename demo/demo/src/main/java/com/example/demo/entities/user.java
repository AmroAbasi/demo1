package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;



@Entity
@Table(name = "users")
public class user implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String password;

    public long id() {
        return id;
    }

    public user setId(long id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public user setName(String name) {
        this.name = name;
        return this;
    }

    public String password() {
        return password;
    }

    public user setPassword(String password) {
        this.password = password;
        return this;
    }

    public user() {
    }
}

