package com.structural.bridge;

public class Brazilian implements FoodType {

    private final DishSize dishSize;

    public Brazilian(DishSize dishSize) {
        this.dishSize = dishSize;
    }

    @Override
    public void getType() {
        System.out.println("Brazilian Food");
    }

    @Override
    public DishSize getDishSize() {
        return this.dishSize;
    }
}
