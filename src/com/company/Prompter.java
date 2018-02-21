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

}
