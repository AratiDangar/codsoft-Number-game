import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int maxAttempts = 5;

        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {

            Random random = new Random();

            // Generate a random integer between 1 and 100 (inclusive)
            int randomNumber = random.nextInt(100) + 1;


            int attempts = 0;
            int score = 0;

            while (attempts < maxAttempts) {
                // Prompt the user for a guess
                System.out.print("Guess a number between 1 and 100 (Attempt " + (attempts + 1) + "): ");


                int guess = scanner.nextInt();

                attempts++; //


                score = maxAttempts - attempts; //


                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }


            if (attempts == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts. The number was: " + randomNumber);
                score = 0;
            }


            System.out.println("Your score for this round is: " + score);


            scanner.nextLine();


            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.charAt(0) == 'y');

        System.out.println("Thanks for playing!");
    }
}
