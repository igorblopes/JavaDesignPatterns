package com.structural.bridge;

public class App {

    public static void main(String[] args) {
        var japanese = new Japanese(new ChildSize());
        japanese.getType();
        japanese.getDishSize().getSize();

        var brazilian = new Brazilian(new AdultSize());
        brazilian.getType();
        brazilian.getDishSize().getSize();
    }
}
