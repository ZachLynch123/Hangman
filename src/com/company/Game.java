package com.company;
// Hold all game related logic
public class Game {
    private String mAnswer;
    private String hits;
    private String misses;

    public Game(String answer){
        mAnswer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        boolean ishit = mAnswer.indexOf(letter) != -1;
        if (ishit) {
            hits += letter;
        } else {
            misses += letter;
        }
        return ishit;
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
