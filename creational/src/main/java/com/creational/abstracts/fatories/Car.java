package com.creational.abstracts.fatories;

public class Car {
    private Doors doors;
    private Tire tire;
    private Engine engine;

    public Car(Doors doors, Tire tire, Engine engine) {
        this.doors = doors;
        this.tire = tire;
        this.engine = engine;
    }

    public Doors getDoors() {
        return doors;
    }

    public Tire getTire() {
        return tire;
    }

    public Engine getEngine() {
        return engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors.getQuantity() +
                ", tire=" + tire.getSize().toString() +
                ", engine=" + engine.getHorsepower() +
                '}';
    }
}
