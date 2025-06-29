package com.structural.facade;

import java.util.Arrays;

public class CaesarCypherFacade {

    public String encode(String word, int shift) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int totalLetters = letters.length;

        String[] charWord = word.split("");

        StringBuilder finalWord = new StringBuilder();

        var addNumber = shift < 0 ? -1 : +1;
        var addLoops = shift < 0 ? +1 : -1;
        var restartPosition = shift < 0 ? totalLetters : 0;

        for(String letter : charWord){
            int loops = shift;
            boolean hasNext = loops != 0;

            var position = Arrays.asList(letters).indexOf(letter);
            while (hasNext) {

                position += addNumber;
                if (position >= totalLetters || position <= 0) {
                   position = restartPosition;
                }

                loops += addLoops;
                if(loops == 0){
                    finalWord.append(letters[position]);
                }

                hasNext = loops != 0;
            }

        }

        return finalWord.toString();
    }
}
