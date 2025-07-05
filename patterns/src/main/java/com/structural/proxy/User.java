package com.structural.proxy;

public class User {

    private final String name;
    private final boolean premium;

    public User(String name, boolean premium) {
        this.name = name;
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }
}
