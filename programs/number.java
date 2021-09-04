import java.util.Scanner;
import java.util.Random;

public class number {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Random random = new Random(); 
        
        int answer = random.nextInt(100);
        
        System.out.println("Guess my number game woah\n");
        System.out.print("What is your name? ");
        String username = scan.nextLine();
        System.out.println("Welcome, " + username + "!");

        
        int attempts = 10;
        
        while (attempts > 0) {
            System.out.print("\nGuess my number! ");
            int guess = scan.nextInt();
            
            if (guess == answer) {
                System.out.println("\nYou guessed my number!");
                System.out.println("Congratulations, " + username);
                System.exit(0);
            } else if (guess > answer) {
                System.out.println("\nThat's too high!");
                attempts --;
                System.out.println("You have " + attempts + " attempts left!");
            } else if (guess < answer) {
                System.out.println("\nThat's too low!");
                attempts --;
                System.out.println("You have " + attempts + " attempts left!");
            } else {
                System.out.println("Error.");
                System.exit(0);
            }
        }
        
        System.out.println("You're out of attempts! Better luck next time.");
        scan.close();
        
    }
}
