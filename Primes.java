/*
 * This program determines whether a given integer is a prime or not
 */

import java.util.Scanner;

class Primes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer greater than 1: ");
    int number = input.nextInt();
    boolean result = isPrime(number); //Call method to determine if it's prime
    if (result) {
      System.out.println("It is prime.");
    }
    else {
      System.out.println("It is NOT prime.");
    }
 }

/*
 * Method that takes in an integer greater than 1
 * returns true/false depending on whether the integer is prime or not
 */
  public static boolean isPrime(int n) {
    int testFactor = 2; //variable to hold possible divisors to test
    while (testFactor <= (n / testFactor)) {
      if (n % testFactor == 0) {
        //we found a divisor of n
        //so, we know n is NOT prime
        return false; //no need to continue testing, send back result
        
      }
      testFactor++; //increment to the next possible divisor to test
    } //end loop
    //loop complete, so n must be prime, return the result
    return true;
  }
}