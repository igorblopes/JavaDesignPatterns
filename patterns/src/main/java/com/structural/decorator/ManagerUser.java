package com.structural.decorator;

public class ManagerUser extends UserDecorator {

    public ManagerUser(User user) {
        super(user);
    }

    @Override
    public void printRoles() {
        super.printRoles();
        System.out.println("Update");
    }
}
