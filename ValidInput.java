/*
 * program to get valid input from the user
 * uses a loop to repeat the input when it is invalid
 */

import java.util.Scanner;

class ValidInput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    //prompt the user for a positive integer
    //and loop until the input is a valid, positive integer
    int number = 0;  //declare the variable before the loop so it is still in scope
    do {
      System.out.println("Please enter a positive integer:");
      if (in.hasNextInt()) { //check that the input is actually an integer
        number = in.nextInt();
        in.nextLine(); //flush the end of line character
      }
      else { //input is NOT an integer, do NOT read it as an integer
        //flush the invalid input
        in.nextLine();
      }        
    } while ( !(number>0) );
    
    //printout the user's input
    System.out.println("Thank you. You entered: " + number);
  }
}