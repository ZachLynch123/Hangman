package com.company;

import java.util.Scanner;

public class Hangman {
    // Main execution file

    public static void main(String[] args) {
        // instantiate the game class
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
            if (answer.length() == 0) {
                System.err.println("Answer is required");
                System.exit(1);
            }
            Game game = new Game(answer);
            // instantiate the prompter
            Prompter prompter = new Prompter(game);
            // While loop that gets user guesses while the remainder of misses  is less than 0
            while (game.getRemainingTries() > 0 && !game.isWon()) {
                prompter.displayProgress();
                prompter.promptForGuess();
                game.getCurrentProgress();
            }
            prompter.displayOutcome();

    }
}
