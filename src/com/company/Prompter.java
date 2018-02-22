package com.company;

import java.util.Scanner;

// This class will do all the I/O for the program
public class Prompter {

    private Game mGame;


    public Prompter (Game game){
        mGame = game;
    }
    public boolean promptForGuess() {
        // Initialize variables
        boolean isHit = false;
        boolean isAcceptable = false;
        Scanner scanner = new Scanner(System.in);

        // Will always happen since it's a do-while loop
        do {
            // Get input and set it to a variable
            System.out.print("Enter a letter:  ");
            String guessInput = scanner.nextLine();

            // Since input always returns a string, have to use charAt. 0 being the first character in the string
            char guess = guessInput.charAt(0);
            try {
                isHit = mGame.applyGuess(guess);

            } catch (IllegalArgumentException iae) {
                System.out.printf("%s. Please try again" ,iae.getMessage());
            }
        } while (! isAcceptable);
        return isHit;
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
