/*
 * Demo program - calculates and prints Euclidean distances between
 * two points on the Cartesian coordinate system
 * i.e., distance between (x1, y1) and (x2, y2)
 * takes in the coordinates of the points as input from the user
 */

import java.util.Scanner;

class Distance {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt the user and take the input for the coordinates
    System.out.println("Please enter the coordinates of the two points");
    System.out.println("x1 = ");
    double x1 = input.nextDouble();
    System.out.println("y1 = "); 
    double y1 = input.nextDouble();
    System.out.println("x2 = ");
    double x2 = input.nextDouble();
    System.out.println("y2 = ");
    double y2 = input.nextDouble();
    
    double xDiff = x2 - x1;
    double yDiff = y2 - y1;
    
    double sumOfSquares = Math.pow(xDiff, 2) + Math.pow(yDiff, 2);
    
    double distance = Math.sqrt(sumOfSquares);
    System.out.print("The distance between (" + x1 + ", " + y1 + ") and");
    System.out.println("(" + x2 + ", " + y2 + ") is " + distance + " units");
  }
}