/* Write a program
 * 1. Take in a positive integer for the total number of cents (money)
 *    e.g. 312 cents
 * 2. Print out the number of each U.S. currency coin needed to get this total
 *    e.g. 312 cents
 *    Output: 12 quarters, 1 dime, 2 pennies
 */

import java.util.Scanner;

class CoinAssignment {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Hello, what's your name?");
    
    String userName = scnr.nextLine();
    
    System.out.println("Hello " + userName + ", would you like to see something cool? (say yes)");
    
    String userResponse = scnr.nextLine();
    
    System.out.println(" Thank you for saying " + userResponse + " , now watch this!");
    
    //prompt user for a cent value
    System.out.println("Please enter a dollar amount (in cents):");
    
    //declare a user input as dollar amount in cents
    int money = scnr.nextInt();
    
    //Divide money amount by 25 for quarter amount
    int quarters = money/25;
    
    //Calculate left over after quarters
    int moneyAfterQuarters = money % 25;
    
    //Calculate money left after quarters
    int dimes = moneyAfterQuarters/10;
      
    int moneyAfterDimes = moneyAfterQuarters % 10;
      
    int nickles = moneyAfterDimes/5;
      
    int moneyAfterNickles = moneyAfterDimes % 5;
      
    int pennies = moneyAfterNickles;
    
      
    System.out.println("Ulysses, " + money + " cents an be made up of " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies.");
      
    
  }
}