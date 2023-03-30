/*
 * Basics of Strings in Java
 * char - 'A'
 * string - "A"
 * static vs non-static methods
 * static - not tied to a specific method
 */

import java.util.Scanner;

class StringBasics {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter some text:");
    String input = scnr.nextLine();
    
    //output the input sentence, one character at a time
    for (int i=0; i<input.length(); i++) {
      System.out.println(input.charAt(i)); //similar to input[i]
    }
    int index = input.indexOf("cat");
    if (index != -1) {
      System.out.println("cat found at " + index);
    }
    else {
      System.out.println("cat is not found in text.");
    }
    
//    System.out.println(input.substring(1,3));
//    System.out.print("Roman alphabet: "); 
//    for (char c = 'A'; c <= 'Z'; c++) { 
//      System.out.print(c); 
//    } 
//    System.out.println();
  }
  
  public static String same(
}