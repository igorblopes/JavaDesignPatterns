package com.structural.decorator;

public class BasicUser implements User {
    @Override
    public void printRoles() {
        System.out.println("Viewer");
    }
}
