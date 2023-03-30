import java.util.Scanner;

class DanyIsGay {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello, what's your name?");
    String userName = in.nextLine();
    System.out.println("Hello " + userName + "! Guess what?");
    String userResponse = in.nextLine();
    System.out.println("You're gay!");
    
    in.close();
  }
}