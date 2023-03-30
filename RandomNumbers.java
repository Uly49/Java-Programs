/*
 * intro to using Random class to generate random numbers
 */

import java.util.Random;

class RandomNumbers {
  public static void main(String[] args) {
    //set up our random number generator
    Random randGen = new Random();
    
    //print out a random integer between 0 and 99
    int number = randGen.nextInt (100);
    System.out.println("The random number is " + number);
    
    //test the rolling-the-die code
    int numSides =6;
    int roll = rollNSidedDie(numSides);
    System.out.println("Rolled a " + numSides + "-sided die. Result is:" + roll);
  }
  
  /*
   * this method will take in a positive integer n
   * it will RETURN the "roll" of an n-sided, fair die
   * the roll is simulated using pseudorandom numbers
   * the result will be a (random) integer between 1 and n
   */
  public static int rollNSidedDie(int n) {
    //set up our random number generator
    Random randGen = new Random();
    int roll = randGen.nextInt(n) + 1; //add 1 to shift result between 1-6 (instead of 0-5)
    return roll; //complete the method and send back the value stored in roll
    
  }
}