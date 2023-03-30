//complete the program

import java.util.Scanner;

class Loop1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = in.nextInt();
    for (int i=1; i<=n; i++) {
      System.out.print(i + " ");
      
    }
    in.close();
  }
}