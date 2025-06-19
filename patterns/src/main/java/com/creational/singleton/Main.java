package com.creational.singleton;

public class Main {

    public static void main(String[] args){
        var create = new Create();
        var read = new Read();

        create.doCreate();
        read.doRead();
    }
}
