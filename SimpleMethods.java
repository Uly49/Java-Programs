/*
 * Creating our own simple static void methods
 * MCS 141
 */

import java.util.Scanner;

class SimpleMethods {
  /*
   * this is the required main method where this program will begin execution
   * note: every Java "application" must have a main() method like the following
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the radius of a circle:");
    double radius = in.nextDouble();
    
    //call the method below to calculate and print the circumference and then the area
    printCircumference(radius);
    printArea(radius);
    
  } //end of main method
  
  /*
   * this method will take in a decimal (double) value as a "parameter" 
   * representing the radius of a circle, r
   * it will print the circumference of the circle, rounded to 3 decimal places
   */
  public static void printCircumference(double r) {
    //this is where the "body" code of the method goes
    //this is the code that will be executed when the method is called
    
    double c = 2 * Math.PI * r; //calculate the circumference
    System.out.printf("Circumference = %.3f\n", c);
  } //end of Circumference method
  
  /*
   * this method takes in a double value representing the radius of a circle
   * it will print the area of the circle, rounded to 3 decimal places
   */
  public static void printArea(double radius) {
    double a = Math.PI * Math.pow(radius,2);
    System.out.printf("Area = %.3f\n", a);
  } //end of the printArea method
  
} // end of SimpleMethods