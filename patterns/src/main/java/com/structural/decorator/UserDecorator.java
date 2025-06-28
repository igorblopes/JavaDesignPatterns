package com.structural.decorator;

public abstract class UserDecorator implements User {

    private final User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public void printRoles(){
        user.printRoles();
    }
}
