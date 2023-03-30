/*
 * Ulysses palomar
 * MCS 141 - Fall 2019
 * Introduction to basic number types in Java
*/

import java.util.Scanner; //necessary to use the scanner for imput

class SimpleNumbers {
  public static void main(String[] args) {
    //set up a scanner to read from the keyboard input
      Scanner scnr = new Scanner(System.in);
    
    //declare a variable, i.e, tell Java we need a variable of that type
    int userAge;
    
    System.out.println("How old are you? If you don't mind me asking...");
    
    //assign a value to the variable. i.e. store a number into the variable
    //userAge = 29;
    //get the value from the user's input, use the Scanner
    userAge = scnr.nextInt();
    
    //print the value of userAge to confirm the value was stored
    System.out.println("The user is " + userAge + " years old.");
    
  }
}