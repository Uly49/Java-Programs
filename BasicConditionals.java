import java.util.Scanner;

class BasicConditionals {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer, please:");
    int number = in.nextInt();
    
    if (number > 0) {
      System.out.println("Your number is positive.");
    }
    else if (number < 0) {
      System.out.println("Your number is negative.");
    }
    else {
      System.out.println("Your number is 0.");
    }
    
    System.out.println("Thank you for using this program. Bye.");
  }
}
