package org.launchcode.javawebdevtechjobsauthentication.models;

import javax.persistence.Entity;

@Entity
public class User {

    private String userName;
    private String password;

    public static String BCryptPasswordEncoder;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
