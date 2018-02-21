package com.company;

public class Hangman {
    // Main execution file

    public static void main(String[] args) {
	    Game game = new Game("answer");
	    Prompter prompter = new Prompter(game);
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("We got a hiiiiit!");
        } else {
            System.out.println("miss");
        }

    }
}
