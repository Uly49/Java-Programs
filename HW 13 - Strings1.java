import java.util.Scanner;
class Strings1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of words:");
    int n = s.nextInt();
    System.out.println("Enter words:");
    String[] words = new String[n];
    for (int i=0; i<n; i++) {
      words[i] = s.next();
    }
    System.out.println(longestWord(words));
    s.close();
  }
  
  //complete the method below to return the longest word
  //in the given array of Strings
  public static String longestWord(String[] words) {
    //TODO
    String longest = " ";
    int maxCount = 0;
    for (int i=0; i<words.length; i++) {
      if (words[i].length() > maxCount) {
        maxCount=words[i].length();
        longest = words[i];
      }
    }
    return longest;
  }
}