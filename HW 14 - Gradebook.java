import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

class Gradebook {
  public static void main(String[] args) throws FileNotFoundException {
    //create a Scanner to get input from the keyboard to ask the user for the file name
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is the name of the file containing the scores?");
    String fileName = keyboard.nextLine();
    //TODO: Complete the program according to the instructions
    //create another Scanner to read from the file
    Scanner fileScan = new Scanner(new File(fileName));
    int numOfStudents = fileScan.nextInt();
    int numOfAssignments = fileScan.nextInt();
    //System.out.println(numOfAssignments);
    int[][]gradebook = new int[numOfStudents][numOfAssignments];
    for (int i=0; i< gradebook.length; i++) {
      for (int j=0; j< gradebook[i].length; j++) {
        gradebook[i][j] = fileScan.nextInt();
      }
    }
    System.out.println("Array of scores:");
    for (int i=0; i<gradebook.length; i++) {
      System.out.println(Arrays.toString(gradebook[i]));
    }
    System.out.println();
    System.out.println("Average score of each assignment:");
    double average = 0;
    double sum = 0;
    for (int j=0; j<numOfAssignments; j++) {
      sum = 0;
      for (int i=0; i<gradebook.length; i++) {
        sum = sum + gradebook[i][j];
      }
      System.out.println("Assignment #" + (j+1) + " Average = " + (sum*1.0/numOfStudents));
    }
    
    keyboard.close();
    fileScan.close();
  }
}