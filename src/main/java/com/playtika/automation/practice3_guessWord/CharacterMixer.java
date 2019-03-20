package com.playtika.automation.practice3_guessWord;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterMixer {

    public String mix(String word) {

        String mixed = mixWord(word);

        while (mixed.equals(word)) {
            mixed = mixWord(word);
        }
        return mixed;
    }

    private String mixWord(String word) {

        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            int index = ThreadLocalRandom.current().nextInt(characters.length);
            swapCharacters(characters, i, index);
        }
        return new String(characters);
    }

    private void swapCharacters(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}