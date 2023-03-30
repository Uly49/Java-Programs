//complete the program

import java.util.Scanner;

class Coprimes {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sNumber = in.nextInt();
    int lNumber = in.nextInt();
    boolean relativePrime = true;
    System.out.println("Smaller number: " + sNumber);
    System.out.println("Larger number: " + lNumber);
    System.out.print("Divisors of " + sNumber + ": 1 ");
    for (int i = 2; i<=sNumber; i++) {
      if (sNumber%i==0) {
        System.out.printf(i + " ");
        if (lNumber%i==0) {
          relativePrime = false;
        }
      }
    }
    
    System.out.println();
    System.out.print("Divisors of " + lNumber + ": 1 ");
    for (int j = 2; j<=lNumber; j++) {
      if (lNumber%j==0) {
        System.out.printf(j + " ");
      }
    }
    System.out.println();
    if (!relativePrime){
      System.out.println("Not Relatively Prime");}
    else {
      System.out.println("Relatively Prime");
    }
  }
}
