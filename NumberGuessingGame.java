import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // 1 to 100
        int attempts = 5;
        int guess;

        System.out.println("🎯 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + attempts + " attempts\n");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("✅ Correct! You won!");
                return;
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }

        System.out.println("\n❌ You lost! The number was: " + number);
        sc.close();
    }
}

