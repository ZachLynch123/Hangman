package com.company;

public class Hangman {
    // Main execution file

    public static void main(String[] args) {
        // instantiate the game class
	    Game game = new Game("answer");
	    // instantiate the prompter
	    Prompter prompter = new Prompter(game);
	    while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }


    }
}
