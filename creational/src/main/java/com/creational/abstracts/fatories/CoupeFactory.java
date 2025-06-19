package com.creational.abstracts.fatories;

public class CoupeFactory implements CarFactory{
    @Override
    public Doors createDoors() {
        return new CoupeDoors();
    }

    @Override
    public Engine createEngine() {
        return new CoupeEngine();
    }

    @Override
    public Tire createTires() {
        return new CoupeTire();
    }
}
