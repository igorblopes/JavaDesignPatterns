package com.structural.flyweight;

public class Order {

    private String name;

    public Order(String name) {
        this.name = name;
        System.out.println("Creating a new object: "+name);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Creating a new object: "+name+" successfully!");
    }
}
