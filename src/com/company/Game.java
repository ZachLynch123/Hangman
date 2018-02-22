package com.company;
// Hold all game related logic
public class Game {
    public static final int MAX_MISSES = 7;
    private String mAnswer;
    private String hits;
    private String misses;

    public Game(String answer){
        mAnswer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) throws IllegalAccessException {
        if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1){
            throw new IllegalAccessException(letter +" has already been guessed");

        }
        boolean ishit = mAnswer.indexOf(letter) != -1;
        if (ishit) {
            hits += letter;
        } else {
            misses += letter;
        }
        return ishit;
    }

    public int getRemainingTries() {
        return MAX_MISSES - misses.length();
    }


    public String getCurrentProgress() {
        String progress = "";

        for (char letter : mAnswer.toCharArray()){
            char display = '_';
            if (hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }

}
