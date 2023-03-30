//complete the program

import java.util.Scanner;

class Loop5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = in.nextInt();
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    in.close();
  }
}