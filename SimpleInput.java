import java.util.Scanner;

class SimpleInput {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Hi, what's your name?");
    
    String name = keyboard.nextLine();
    
    System.out.println("Nice to meet you, " + name);
    
    System.out.println("Guess what " + name);
    
    String answer = keyboard.nextLine();
    
    System.out.println("You're gay.");
    
    keyboard.close();
    
  }
}