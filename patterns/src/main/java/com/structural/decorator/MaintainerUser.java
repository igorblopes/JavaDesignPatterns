package com.structural.decorator;

public class MaintainerUser extends UserDecorator {

    public MaintainerUser(User user) {
        super(user);
    }

    @Override
    public void printRoles() {
        super.printRoles();
        System.out.println("Turn On System");
        System.out.println("Turn Off System");
    }
}
