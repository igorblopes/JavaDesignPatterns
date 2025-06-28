package com.structural.decorator;

public class AdminUser extends UserDecorator {

    public AdminUser(User user) {
        super(user);
    }

    @Override
    public void printRoles() {
        super.printRoles();
        System.out.println("Delete");
        System.out.println("Create");
        System.out.println("Update");
    }
}
