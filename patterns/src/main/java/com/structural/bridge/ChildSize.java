package com.structural.bridge;

public class ChildSize implements DishSize{
    @Override
    public void getSize() {
        System.out.println("Child Dish Size");
    }
}
