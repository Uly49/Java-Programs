/*
 * program to simulate the rolling of two six-sided, fair dice
 */

import java.util.Random;
import java.util.Scanner;

class DiceRoll {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many times shall we roll the dice?");
    int numRolls = in.nextInt();
    
    System.out.println("Rolling the dice...");
    int numFives = 0; //variable to keep track of the tally of fives rolled
    //use a loop to roll the dice numRolls times
    while (numRolls > 0) {
      int rollTotal = rollDice();
      System.out.println("roll: " + rollTotal );
      if (rollTotal == 5) {
        numFives++; //because 5 was rolled, increment the tally 
      }
      //numRolls = numRolls - 1; //update numRolls by decrementing it
      //System.out.println("current numRolls: " + numRolls);
      numRolls--;
    }
    
    //loop is complete, print out the tally
    System.out.println("Number of fives rolled: " + numFives);
  }
  
  /*
   * this method will simulate the roll of two six-sided, fair dice
   * returns the total of the rolls
   * e.g., first die is "rolled" to get a 5 and second die is rolled to get a 2
   * the method would return the total of 7
   * the method requires no arguments (has no parameters)
   */
  public static int rollDice() {
    Random randGen = new Random(); //set up a new random number generator
    int die1 = randGen.nextInt(6) + 1; //generates a random int between 1-6
    int die2 = randGen.nextInt(6) + 1;
    return die1 + die2; //return the sum of the dice rolled
  }
}