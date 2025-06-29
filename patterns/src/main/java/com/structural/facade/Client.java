package com.structural.facade;

public class Client {

    public static void main(String[] args) {
        String input = "volume";

        var constructorFacade = new CaesarCypherFacade();
        var cipher = constructorFacade.encode(input, 7);

        System.out.println("Cipher: " + cipher);
    }
}
