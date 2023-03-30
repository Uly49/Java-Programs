/*
 * More on basic number types and arithmatic
 * Ulysses Palomar
 * MCS 141
 */

import java.util.Scanner;

class MoreNumbers {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    //prompt user for a radius
    System.out.println("Please enter the radius of a circle (in centimeters):");
    
    //declre a floating point variable and store user input
    double radius = scnr.nextDouble();
    
    //calculate and print the circumference of the circle
    double circumference = 2 * Math.PI * radius;
    System.out.printf("The circumference of the circle is %.2f cm", circumference);
    System.out.println(); //end the line
    
    //calculate and print the area of a circle
    double area = Math.PI * Math.pow(radius,2);
    System.out.printf("The area of the circle is %.4f cm^2\n", area);
    
    
  }
}