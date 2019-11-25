package tijch05;

import java.util.*;


public class GuessMyNumberNoRecursion {

    public static void main(String[] args) {
        Random random = new Random();
        int myNumber = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100, guess my number!: ");
        Scanner input = new Scanner(System.in);

        while(true) {
            int guess = input.nextInt();
            if (guess < myNumber) {
                System.out.println("Your guess is too low! Try again.");
            } else if (guess > myNumber) {
                System.out.println("Your guess is too high! Try again.");
            } else {
                System.out.println("Your guess is spot on!");
                break;
            }
        }
    }

}
