import java.util.Scanner;
import java.util.Random;

class guessingGame {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random randGen = new Random();
    int number = randGen.nextInt(100);
    int tries = 0;
    //System.out.println(number);
    System.out.println("Let's play a game!");
    System.out.println("I have picked a number between 1 and 100.");
    System.out.println("Can you guess the number?");
    boolean win = false;
    while (!win) {
      int userGuess = in.nextInt();
      tries++;
      
      if (userGuess == number) {
        win = true;
      }
      
      else if (userGuess < number) {
        System.out.println("Too low");
        System.out.println("Guess again");
      }
      
      else if (userGuess > number) {
        System.out.println("Too high");
        System.out.println("Guess again");
      }
    }
    System.out.println("Congratulations, you guessed the right number: " + number + "!");
    
    if (tries == 1) {
      System.out.println("It only took you " + tries + " try.");
    }
    else {
      System.out.println("It only took you " + tries + " tries.");
    }
  }
}
