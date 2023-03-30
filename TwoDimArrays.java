/*
 * intro to two-dimensional arrays (2D arrays) in Java
 * a two-dimensional array is really just an array of arrays
 */

import java.util.Random;
import java.util.Arrays;

class TwoDimArrays {
  public static void main (String[] args) {
    //declare a two-dimensional array of int values
    int[][]array = new int[4][3]; //an array of 4 sub-arrays, each sub-array with 3 ints
    
    Random randGen = new Random();
    
    //fill the array with random numbers
    for (int i=0; i<array.length; i++) { //go through each row, i, one at a time
      for (int j=0; j<array[i].length; j++) { //go through each column, j, of row i
        array[i][j] = randGen.nextInt(11);
      }
    }
    
    for (int i=0; i<array.length; i++) { //print out each row
      System.out.println(Arrays.toString(array[i]));
    }
  }
}
