/*
 * Complete the methods below according the comments
 */

import java.util.*;

class Review {
  //method that takes in an array and returns a copy
  //all the values in the copy are ten times the values in the original
 public static int[] timesTen(int[] arr) {
  //TODO
  for (int i = 0; i<arr.length; i++) {
      arr[i]=arr[i]*10;
    }
  return arr;

 }
 
  
  //method that takes in an array and returns an array with only the even numbers
  public static int[] onlyEvens(int[] arr) {
  //TODO
    int evenCount = 0;
    for (int i = 0; i<arr.length; i++) {
      arr[i] = arr[i]/10;
      if (arr[i]%2==0) {
        evenCount++;
      }
    }
    System.out.println(Arrays.toString(arr));
    int [] evens = new int[evenCount];
    int index = 0;
    for (int i = 0; i<arr.length; i++) {
      if (arr[i]%2==0) {
        evens[index] = arr[i];
        index++;
      }
    }
    return evens;


 }
  
  
  //method that takes in an array of integers
  //returns a String made up of the corresponding uppercase letters
  //where A=1, B=2, C=3, ..., D=26
  //each int value that is not between 1-26 are replaced in the String with a lowercase 'x'
  //e.g., arr = [3, 8, 40, 10, 1, 31] would return "CHxJAx"
  public static String letterReplace(int[] arr) {
  //TODO
    
    
 }
  
  
  
  //THIS IS THE CODE THAT TESTS THE METHOD ABOVE
  //DO NOT MODIFY THIS CODE
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int seed = s.nextInt();
    Random r = new Random(seed);
    int[] a = new int[r.nextInt(20)+1];
    for (int i=0; i<a.length; i++) {
      a[i] = r.nextInt(50)+1;
    }
    System.out.println(Arrays.toString(a)); //print original test array
    
    //test methods
    System.out.println(Arrays.toString(timesTen(a)));
    System.out.println(Arrays.toString(onlyEvens(a)));
    System.out.println(letterReplace(a));
    
  }
}