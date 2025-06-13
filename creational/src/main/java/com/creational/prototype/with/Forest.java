package com.creational.prototype.with;

import java.util.List;

public class Forest {


    public static void main(String[] args){
        BirdType falcon = new BirdType("Falcon");
        Bird falconBird1 = new Bird(3, falcon);
        Bird falconBird2 = falconBird1.clone();
        Bird falconBird3 = falconBird1.clone();
        Bird falconBird4 = falconBird1.clone();
        Bird falconBird5 = falconBird1.clone();


        BirdType chicken = new BirdType("Chicken");
        Bird chickenBird1 = new Bird(2, chicken);
        Bird chickenBird2 = chickenBird1.clone();
        Bird chickenBird3 = chickenBird1.clone();
        Bird chickenBird4 = chickenBird1.clone();
        Bird chickenBird5 = chickenBird1.clone();


        List<Animal> animals = List.of(falconBird1, falconBird2, falconBird3, falconBird4, falconBird5, chickenBird1, chickenBird2, chickenBird3, chickenBird4, chickenBird5);

        createForest(animals);
    }

    private static void createForest(List<Animal> animals) {
        System.out.println("Animals created: ");
        animals.forEach(System.out::println);
    }
}
