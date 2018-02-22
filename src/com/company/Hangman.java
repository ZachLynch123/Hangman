package com.company;

public class Hangman {
    // Main execution file

    public static void main(String[] args) {
        // instantiate the game class
	    Game game = new Game("allison");
	    // instantiate the prompter
	    Prompter prompter = new Prompter(game);
	    // While loop that gets user guesses while the remainder of misses  is less than 0
	    while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
            game.getCurrentProgress();
        }
        prompter.displayProgress();


    }
}
