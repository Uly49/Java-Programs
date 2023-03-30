import java.util.Scanner;
class Strings2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a word:");
    String word = s.next();
    System.out.println("Palindrome?");
    System.out.println(isPalindrome(word));
    s.close();
  }
  
  //complete the method to determine if the given word
  //is a palindrome or not
  public static boolean isPalindrome(String word) {
    //TODO
    boolean isPalindrome = true;
    int n = word.length();
    for (int i=0; i<(n/2); i++) {
      if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt((n-1)-i))) {
        isPalindrome = false;
      }
    }
    return isPalindrome;
  }
}