/*
 * program to print out a table of multiples, m by n
 */
import java.util.Scanner;

class Multiples {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter m and n:");
    int m = in.nextInt();
    int n = in.nextInt();
    
    for (int j=1; j<=n; j++) { //count from 1 to n: the "rows"
      for (int i=1; i<=m; i++) { //count from 1 to m: the "columns"
        System.out.print(i*j + " ");
      }
      System.out.println();
    }
  }
}