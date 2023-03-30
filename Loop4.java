//complete the program

import java.util.Scanner;

class Loop4 {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int sum = 0;
   System.out.println("Enter a positive integer:");
   int n = in.nextInt();
   for (int i=3; i<=n; i+=3) {
     System.out.print(i + " ");
     sum = sum + i;
   }
   System.out.println();
   System.out.println(sum);
   in.close();
  }
}