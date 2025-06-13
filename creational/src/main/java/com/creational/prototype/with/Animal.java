package com.creational.prototype.with;

public abstract class Animal {

    private Integer age;

    public Animal(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract Animal clone();
}
