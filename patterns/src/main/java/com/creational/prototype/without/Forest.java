package com.creational.prototype.without;

import java.util.List;

public class Forest {


    public static void main(String[] args){
        BirdType falcon = new BirdType("Falcon");
        Bird falconBird1 = new Bird(3, falcon);
        Bird falconBird2 = new Bird(3, falcon);
        Bird falconBird3 = new Bird(3, falcon);
        Bird falconBird4 = new Bird(3, falcon);
        Bird falconBird5 = new Bird(3, falcon);


        BirdType chicken = new BirdType("Chicken");
        Bird chickenBird1 = new Bird(2, chicken);
        Bird chickenBird2 = new Bird(2, chicken);
        Bird chickenBird3 = new Bird(2, chicken);
        Bird chickenBird4 = new Bird(2, chicken);
        Bird chickenBird5 = new Bird(2, chicken);


        List<Animal> animals = List.of(falconBird1, falconBird2, falconBird3, falconBird4, falconBird5, chickenBird1, chickenBird2, chickenBird3, chickenBird4, chickenBird5);

        createForest(animals);
    }

    private static void createForest(List<Animal> animals) {
        System.out.println("Animals created: ");
        animals.forEach(System.out::println);
    }
}
