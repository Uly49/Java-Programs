/*
 * introduction to arrays in Java
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class ArrayIntro {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random randGen = new Random();
    
    System.out.println("How many random integers should we generate?");
    int n = in.nextInt();
    
    //create an array to store n integers
    int[] myArray; //declare the array variable to be of type: "array of integers"
    myArray = new int[n]; //creates the array in memory with n "cells", number of elements is n
    
    //initialize the array with values
    for (int i=0; i<myArray.length; i++) {
      myArray[i] = randGen.nextInt(201)-100;  //assign a random int, -100 to 100, to the spot
    }
    
    for (int i=0; i<myArray.length; i++) { //print out each element of the array, on separate lines
      System.out.print(myArray[i]+",");
    }
    System.out.println();
    
    //use th method from the Arrays class to "sort" the values in ascending order
    Arrays.sort(myArray);
    
    //use the method from the Arrays class to turn the entire array into a String to print
    System.out.println(Arrays.toString(myArray));
    
    //find the arithmetic mean, "the average"
    int sum = 0; //variable to hold the running total as we compute the sum
    for (int i=0; i<myArray.length; i++) {
      sum += myArray[i];
    }
    System.out.println("Average is " + ((double) sum/n));
    
    //find the medium value
    if (n%2==0) {
      //even number of elements, median is the average of the two middle values
      double median = (myArray[n/2] + myArray[n/2+1])/2.0;
      System.out.println("Median: " + median);
    }
    else {
      //odd number of elements, median is just the middle
      System.out.println("Median: " + myArray[n/2]);
    }
    in.close();
  }
}