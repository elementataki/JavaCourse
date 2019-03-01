package com.playtika.automation.practice2guessword;

import java.util.Scanner;

public class GuessWord {

    private final WordSource wordSource = new WordSource();
    private final CharacterMixer characterMixer = new CharacterMixer();

    public static void main(String[] args) {

        GuessWord guessWord = new GuessWord();
        guessWord.playGame();
    }

    public void playGame() {

        Scanner console = new Scanner(System.in);
        String word = wordSource.getWord();
        String mixedWord = characterMixer.mix(word);
        System.out.printf("Guess the word: %s%n", mixedWord);
        String userWord = console.nextLine();

        while (true) {
            if (word.equalsIgnoreCase(userWord)) {
                System.out.println("Well done!");
                break;
            } else {
                System.out.println("Try again!");
                userWord = console.nextLine();
            }
        }
    }
}