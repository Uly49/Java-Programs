//complete the program

import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("n:");
    int n = in.nextInt();
    int o = 0;
    int p = 1;
    int q = 1;
    System.out.print(o + " " + p + " ");
    for (int i = 3; i<=n; i++) {
      q = (o + p);
      System.out.print(q + " ");
      o = p;
      p = q;
    }
  }
}