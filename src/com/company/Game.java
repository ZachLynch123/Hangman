package com.company;
// Hold all game related logic
public class Game {
    public static final int MAX_MISSES = 7;
    private String mAnswer;
    private String hits;
    private String misses;

    public Game(String answer){
        mAnswer = answer.toLowerCase();
        hits = "";
        misses = "";
    }

    private char normalizedGuess(char letter) {
        if (! Character.isLetter(letter)) {
            throw new IllegalArgumentException("A letter is required");
        }
        letter = Character.toLowerCase(letter);
        if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1){
            throw new IllegalArgumentException(letter +" has already been guessed \n");
        }
        return letter;
    }
    public boolean applyGuess(String letters) {
        if (letters.length() == 0){
            throw new IllegalArgumentException("No letter found");
        }
        return applyGuess(letters.charAt(0));
    }

    public boolean applyGuess(char letter){
        // Calls exceptions if the character ins't a letter or has already been guessed
        letter = normalizedGuess(letter);

        //
        boolean ishit = mAnswer.indexOf(letter) != -1;
        if (ishit) {
            hits += letter;
        } else {
            misses += letter;
        }
        return ishit;
    }

    public String getAnswer() {
        return mAnswer;
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
    public boolean isWon() {
        return getCurrentProgress().indexOf('_') == -1;

    }

}
