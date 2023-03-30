//complete the program

import java.util.Scanner;

class Loop3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = in.nextInt();
    if (n % 2 ==0) {
      for (int i=n; i>=0; i-=2) {
        System.out.print(i + " ");
      }
    }
    else {
      for (int i=n-1; i>=0; i-=2) {
        System.out.print(i + " ");
      }
    }
    in.close();
  }
}

