import java.util.Scanner;
import java.io.*;

class LetterCounter {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a file name (e.g. mytext.txt):");
    String userFile = input.nextLine();
    Scanner fileScan = new Scanner(new File(userFile));
    count(fileScan);
    
    
    
    
    input.close();
    fileScan.close();
  }
  public static void count(Scanner fileScan) {
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    int[] count;
    count = new int[26];
    while (fileScan.hasNext()) {
      String word = fileScan.next();
      word = word.toLowerCase();
      int length = word.length();
      for (int i=0; i<length ;i++) {
        char letter = word.charAt(i);
        int place = alpha.indexOf(letter);
        if (place != -1) {
          count[place]++;
        }
      }
    }
    for (int i=0; i<26; i++) {
      System.out.println("The number of " + alpha.charAt(i) + "'s is " + count[i]);
    }
  }
}