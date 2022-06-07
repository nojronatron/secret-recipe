package com.JonsSecretReceipe.SecretRecipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) Long id;
    String username;
    String password;

    public SiteUser(){}

    public SiteUser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
