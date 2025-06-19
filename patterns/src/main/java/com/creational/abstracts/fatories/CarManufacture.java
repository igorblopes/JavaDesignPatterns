package com.creational.abstracts.fatories;

public class CarManufacture {


    public static void main(String[] args){
        Car suv = buildCar("SUV");
        Car coupe = buildCar("COUPE");

        System.out.println(suv);
        System.out.println(coupe);
    }

    private static Car buildCar(String type) {
        var carFactory = FactoryMaker.createFactory(type);
        var doors = carFactory.createDoors();
        var tire = carFactory.createTires();
        var engine = carFactory.createEngine();
        return new Car(doors, tire, engine);
    }
}
