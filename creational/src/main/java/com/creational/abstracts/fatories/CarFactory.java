package com.creational.abstracts.fatories;

public interface CarFactory {

    Doors createDoors();
    Engine createEngine();
    Tire createTires();

}
