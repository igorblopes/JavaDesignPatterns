package com.creational.prototype.without;

public class Bird extends Animal {

    private BirdType type;


    public Bird(Integer age, BirdType type) {
        super(age);
        this.type = type;
    }

    public BirdType getType() {
        return type;
    }

    public void setType(BirdType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + super.getAge() + ", " +
                "type=" + type +
                '}';
    }
}
