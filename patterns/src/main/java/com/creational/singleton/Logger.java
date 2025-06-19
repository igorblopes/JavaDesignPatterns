package com.creational.singleton;

// Using enum because is thread safe
public enum Logger {

    INSTANCE;
    private Logger() {}

    public static Logger getInstance() {
        return INSTANCE;
    }

    void log(String message) {
        String initial = "Logger: ";
        System.out.println(initial+message);
    }
}
