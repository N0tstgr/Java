import java.util.Random;
import java.util.Scanner;

public class CricketGame {
    private static final Random random = new Random();
    private static int totalRuns = 0;
    private static int wickets = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Cricket Game!");
        System.out.println("You will bat against the computer. Try to score as many runs as possible.");

        while (wickets < 3) {
            System.out.println("\nOver " + (wickets + 1) + " - Your Turn to Bat!");
            int runs = bat();
            if (runs == -1) {
                System.out.println("You are out! Total runs: " + totalRuns);
                wickets++;
            } else {
                totalRuns += runs;
                System.out.println("You scored " + runs + " runs this ball. Total runs: " + totalRuns);
            }
        }

        System.out.println("\nGame Over! You scored " + totalRuns + " runs and lost 3 wickets.");
        scanner.close();
    }

    private static int bat() {
        System.out.println("\nPress 1 to play a shot, or 0 to leave the ball:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Random runs between 0 and 6 (for a valid shot)
            int runs = random.nextInt(7); // 0 to 6 runs on a valid shot
            if (runs == 0) {
                System.out.println("You missed! You are OUT.");
                return -1; // Player is out
            } else {
                return runs;
            }
        } else if (choice == 0) {
            // Let the ball go, no runs
            System.out.println("You left the ball. No runs.");
            return 0;
        } else {
            System.out.println("Invalid choice. Please try again.");
            return bat(); // Recursion in case of invalid input
        }
    }
}
