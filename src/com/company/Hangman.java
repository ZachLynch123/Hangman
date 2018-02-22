package com.company;

public class Hangman {
    // Main execution file

    public static void main(String[] args) {
        // instantiate the game class
	    Game game = new Game("answer");
	    // instantiate the prompter
	    Prompter prompter = new Prompter(game);
	    prompter.displayProgress();
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("We got a hiiiiit!");
        } else {
            System.out.println("miss");
        }
        prompter.displayProgress();
    }
}
