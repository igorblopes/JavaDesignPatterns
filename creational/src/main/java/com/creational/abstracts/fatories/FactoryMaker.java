package com.creational.abstracts.fatories;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<CarFactory>> carTypes = new HashMap<>();

    static {
        carTypes.put("SUV", SuvFactory::new);
        carTypes.put("COUPE", CoupeFactory::new);
    }

    public static CarFactory createFactory(String type) {
        if(carTypes.containsKey(type)){
            return carTypes.get(type).get();
        }

        throw new IllegalArgumentException("Car Type not supported");
    }
}
