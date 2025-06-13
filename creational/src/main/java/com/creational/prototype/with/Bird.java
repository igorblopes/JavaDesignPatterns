package com.creational.prototype.with;

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
                "name=" + super.getAge() + ", " +
                "type=" + type +
                '}';
    }

    @Override
    public Bird clone() {
        return new Bird(this.getAge(), this.getType());
    }
}
