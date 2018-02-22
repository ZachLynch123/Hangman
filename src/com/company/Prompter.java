package com.company;

import java.util.Scanner;

// This class will do all the I/O for the program
public class Prompter {

    private Game mGame;


    public Prompter (Game game){
        mGame = game;
    }
    public boolean promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:  ");
        String  guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        return mGame.applyGuess(guess);
    }
    public void displayProgress() {
        System.out.printf("Try to solve: %s%nYou have %d guesses to solve %n", mGame.getCurrentProgress(),
                mGame.getRemainingTries());

    }
/*
enhanced for loop
// for each letter in the example.toCharArray()
for (char letter : example.toCharArray()) {
 System.out.println(" we got the letter " + letter);
}

 */
}
