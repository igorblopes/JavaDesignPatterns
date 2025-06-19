package com.creational.abstracts.fatories;

public class SuvFactory implements CarFactory{
    @Override
    public Doors createDoors() {
        return new SuvDoors();
    }

    @Override
    public Engine createEngine() {
        return new SuvEngine();
    }

    @Override
    public Tire createTires() {
        return new SuvTire();
    }
}
