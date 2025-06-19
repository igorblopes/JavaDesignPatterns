package com.structural.bridge;

public class Japanese implements FoodType {

    private final DishSize dishSize;

    public Japanese(DishSize dishSize) {
        this.dishSize = dishSize;
    }

    @Override
    public void getType() {
        System.out.println("Japanese Food");
    }

    @Override
    public DishSize getDishSize() {
        return this.dishSize;
    }
}
