package com.example.kpaplication;

import java.io.Serializable;

public class User implements Serializable {
    private String kpLogin;
    private String kpPassword;

    public User(String kpLogin, String kpPassword) {
        this.kpLogin = kpLogin;
        this.kpPassword = kpPassword;
    }

    public String getKpLogin() {
        return kpLogin;
    }

    public void setKpLogin(String kpLogin) {
        this.kpLogin = kpLogin;
    }

    public String getKpPassword() {
        return kpPassword;
    }

    public void setKpPassword(String kpPassword) {
        this.kpPassword = kpPassword;
    }
}
