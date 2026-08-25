import java.util.Scanner;
import java.util.Random;

public class Account {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess == number) {
                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);
                break;
            }
            else if (guess < number) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("Too high!");
            }
        }

        sc.close();
    }
}