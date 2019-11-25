package tijch05;

import java.util.*;


public class GuessMyNumberWithRecursion {

    public static final int myNumber = (int) (Math.random() * 100);

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100, guess my number!: ");
        guessMyNumber();
    }

    public static void guessMyNumber() {
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        if (guess == myNumber) {
            System.out.println("Your guess is spot on!");
        } else {
            if (guess < myNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            guessMyNumber();
        }

    }

}
