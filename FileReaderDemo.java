/*
 * sample program that reads text from a file
 * this program assumes the file is named words.txt
 */

import java.util.Scanner;
import java.io.*; //so we can use files

class FileReaderDemo {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner fileScan = new Scanner(new File("Tom2.txt"));
    
    //read in an entire line: System.out.println(fileScan.nextLine());
    
    //instead loop through the file, one word at a time
    int count = 0;
    while (fileScan.hasNext()) {
      String word = fileScan.next(); //read in the next word
      if (word.equalsIgnoreCase("huck")) {
        System.out.println(word);
        count++;
      }
      else {
        word = word.toLowerCase(); //replace the current word with an all-lowercase version
        if (word.indexOf("huck") != -1) {
          System.out.println(word);
          count++;
        }
      }
    }
    System.out.println("huck found " + count + " times.");
    
    fileScan.close();
  }
}