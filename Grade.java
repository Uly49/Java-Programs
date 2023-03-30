/*
 * ask the user for their score on an ecxam (assume between 0-100)
 * print out the resulting letter grade on the exam (A, B, C, D, F)
 * based on a traditional scale (90-100: A, 80-89: B, 70-79: C, 60-69: D, 0-59: F)
 */
import java.util.Scanner;

class Grade {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the exam score (0-100):");
    double examScore = scn.nextDouble();
    
    if (90 <= examScore && examScore <= 100) {
      //90-100
      System.out.println("A");
    }
    else if (80 <= examScore) {
      //80-89
      System.out.println("B");
    }
    else if (70 <= examScore) {
      //70-79
      System.out.println("C");
    }
    else if (60 <= examScore) {
      //60-69
      System.out.println("D");
    }
    else {
      //0-59
      System.out.println("F");
    }
  }
}