import java.util.Arrays;
import java.util.Scanner;

class MoreArrays {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //prompt the user for the total number of words to be input
    System.out.println("How many words will you enter?");
    int n = in.nextInt();
    
    //take in all the words, one at a time, and store them into an array
    System.out.println("Ok, please enter the words, one at a time.");
    String[] allWords = new String[n];
    for (int i=0; i<allWords.length; i++) {
      allWords[i] = in.next();
    }
    
    //print out the words the user input, using the enhanced for-loop
    for (String currentWord : allWords) {
      System.out.print(currentWord + " ");
    }
    System.out.println();
    
    Arrays.sort(allWords);
    System.out.println(Arrays.toString(allWords));
    
    System.out.println("Enter a word to find:");
    String toFind = in.next();
    
    boolean found = false;
    for (String currentWord : allWords) {
      if(currentWord.equals(toFind)) {
        System.out.println("Found it");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Not found.");
    }
    in.close();
  }
}