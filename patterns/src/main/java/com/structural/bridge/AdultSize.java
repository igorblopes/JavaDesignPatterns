package com.structural.bridge;

public class AdultSize implements DishSize{
    @Override
    public void getSize() {
        System.out.println("Adult Dish Size");
    }
}
