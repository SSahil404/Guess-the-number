import java.util.Random;
import java.util.Scanner;

class Game {
    int noOfGuesses = 0, randInt, userInput;

    public Game() {
        Random r = new Random();
        this.randInt = r.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        boolean result = false;
        while (!result) {
            noOfGuesses++;

            System.out.print("Guess The Number: ");
            userInput = sc.nextInt();
            result = isCorrectNumber(userInput);

            if (result) {
                System.out.println("\n\n\tYay");
                System.out.println("\nYou Guessed The Number!");
                System.out.println("The number was: " + randInt);
                System.out.printf("You take %d Guesses!\n\n", noOfGuesses);
                break;
            }
        }
        sc.close();
    }

    boolean isCorrectNumber(int x) {
        if (x == this.randInt)
            return true;
        else if (x < this.randInt)
            System.out.println("Too Low, Guess some higher!\n");
        else if (x > this.randInt)
            System.out.println("Too High, Guess some lower!\n");
        else
            System.out.println("You Guessed The Wrong Number!");
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game player = new Game();
        player.takeUserInput();
    }
}
