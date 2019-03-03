package com.playtika.automation.practice3guessword;

import java.util.concurrent.ThreadLocalRandom;

public class WordSource {

    private static final String[] WORDS = {
            "addition",
            "subtraction",
            "discovery",
            "multiplication",
            "division",
            "modulus",
            "increment",
            "decrement"
    };

    public String getWord() {
        int index = ThreadLocalRandom.current().nextInt(WORDS.length);
        return WORDS[index];
    }
}