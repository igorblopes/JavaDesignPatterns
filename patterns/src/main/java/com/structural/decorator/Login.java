package com.structural.decorator;

public class Login {

    public static void main(String[] args) {
        System.out.println("Creating UserBasic");
        var user = new BasicUser();
        user.printRoles();

        System.out.println("Creating Admin from userBasic");
        var adminUser = new AdminUser(user);
        adminUser.printRoles();

        System.out.println("Creating Manager from userBasic");
        var managerUser = new ManagerUser(user);
        managerUser.printRoles();

        System.out.println("Creating Maintainer from AdminUser");
        var maintainer = new MaintainerUser(adminUser);
        maintainer.printRoles();
    }
}
