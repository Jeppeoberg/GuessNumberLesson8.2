/*
 * Game Class
 * Responsible for:
 * - Generating a random number
 * - Checking the player's guess
 * - Returning feedback ("Too high", "Too low", "Correct!")
 */

public class Game {

    // Variable to store the secret number
    private int secretNumber;

    // Constructor
    // Should generate the secret number when a Game object is created
    public Game() {
        // generateRandomNumber();
    }

    // Method to generate a random number between 1 and 100
    private void generateRandomNumber() {
        // Logic to create random number and store in secretNumber
    }

    // Method to check the player's guess
    // Returns feedback as a String
    public String checkGuess(int guess) {
        // Compare guess with secretNumber
        // Return "Too high", "Too low" or "Correct!"
        return ""; // placeholder
    }
}