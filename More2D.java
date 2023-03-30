/*
 * more 2-D arrays
 * specifically "ragged" arrays, i.e., arrays with varying sized sub-arrays
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class More2D {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random randGen = new Random();
    
    System.out.println("Enter an integer, n:");
    int n = in.nextInt();
    
    //create a ragged array with a random number of columns per row
    int[][] arr = new int[n][]; //create n "rows" but do NOT create the sub-arrays yet
    for (int i=0; i<arr.length; i++) {
      arr[i] = new int[randGen.nextInt(10) + 1]; //create a random-length sub-array
    }
    
    //fill the array with some values
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[i].length; j++) {
        arr[i][j] = randGen.nextInt(100)+1; //assign a random number between 1-100
      }
    }
    
    for (int i=0; i<arr.length; i++) {
      System.out.println(Arrays.toString(arr[i])); //print out the entire i-th row
    }
    
    System.out.println("Max value is " + findLargest(arr));
    
     //create a famous "ragged" array, i.e., an array with different sized sub-arrays
    int[][] p = new int[n][]; //creates array with n rows
    for (int i=0; i<p.length; i++) {
      p[i] = new int[i+1]; //creates the sub-array in each row with increasing number of columns
    }
    
    for (int i=0; i<p.length; i++) {
      for (int j=0; j<p[i].length; j++) {
        if (j==0 || i==j) {
          p[i][j] = 1;
        }
        else {
          p[i][j] = p[i-1][j-1] + p[i-1][j];
        }
      }
    }
    
    for (int i=0; i<p.length; i++) {
      System.out.println(Arrays.toString(p[i])); //print out row i
    }
    in.close();
  } //end of main method
  
  /*
   * this method takes in a two-dimensional array of ints
   * returns the largest int
   */
  public static int findLargest(int[][] array) {
    int max = Integer.MIN_VALUE; //start with max set to the smallest possible value
    for (int i=0; i<array.length; i++) {
      for (int j=0; j<array[i].length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
        }
      }
    }
    return max;
  }
  
}