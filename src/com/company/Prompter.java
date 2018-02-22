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
            try {
                isHit = mGame.applyGuess(guessInput);
                isAcceptable = true;
            } catch (IllegalArgumentException iae) {
                System.out.printf("%s. Please try again\n" ,iae.getMessage());
            }
        } while (! isAcceptable);
        return isHit;
    }
    public void displayProgress() {
        System.out.printf("Try to solve: %s%nYou have %d guesses to solve %n", mGame.getCurrentProgress(),
                mGame.getRemainingTries());

    }

    public void displayOutcome() {
        if (!mGame.isWon()){
            System.out.printf("Sorry, you lost. Game over. The answer was %s >:)", mGame.getAnswer());
        }else {
            System.out.printf("Congratulations! You won with %s tries remaining!", mGame.getRemainingTries());
        }

    }
/*
enhanced for loop
// for each letter in the example.toCharArray()
for (char letter : example.toCharArray()) {
 System.out.println(" we got the letter " + letter);
}

 */
}
