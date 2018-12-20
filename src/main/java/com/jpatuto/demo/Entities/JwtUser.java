package com.jpatuto.demo.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user")
public class JwtUser {

    @Id
    private int id;
    private String username;
    private String password;

    public JwtUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public JwtUser() {
    }
}
