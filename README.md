# Guess the Number Game

A simple console-based "Guess the Number" game implemented in Java using the Observer Pattern.

## Overview

This project implements a console-based "Guess the Number" game where players take turns guessing a randomly generated number between 1 and 100. The game notifies players of their guesses and provides feedback on whether their guesses are too high, too low, or correct. The game continues until one of the players guesses the correct number.

## Features

- Randomly generates a number between 1 and 100 for players to guess.
- Notifies players of their guesses and provides feedback on whether they are too high, too low, or correct.
- Uses the Observer Pattern to decouple game logic from player interaction.
- Handles endgame conditions when a player guesses the correct number.

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/guess-the-number-game.git
    ```

2. Compile the Java files:

    ```bash
    javac *.java
    ```

3. Run the `GuessTheNumberGame` class:

    ```bash
    java GuessTheNumberGame
    ```

4. Follow the on-screen instructions to play the game.

## Observer Pattern

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. In this project, the game class acts as the subject, and the player class acts as the observer. When a player makes a guess, the game notifies all players about the guess, and each player updates its state accordingly.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

- [Manish](https://github.com/iampushkar)

Feel free to fork, contribute, or provide feedback on this project!
