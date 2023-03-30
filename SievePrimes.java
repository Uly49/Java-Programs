import java.util.Scanner;
import java.util.Arrays;

class SievePrimes {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer, n, greater than 1:");
    int n = in.nextInt();
    
    //Let A be an array of Boolean values, indexed by integers 2 to n,
    //initially all set to true.
    boolean[] A = new boolean[n+1]; //note: indices 0 and 1 will not be used
    for (int i=2; i<A.length; i++) {
      A[i] = true;
    }
    
    //for i = 2, 3, 4, ..., not exceeding ?n:
    //  if A[i] is true:
    //    for j = i^2, i^2+i, i^2+2i, i^2+3i, ..., not exceeding n:
    //      A[j] := false.
    
    for (int i=2; i*i<=n; i++) { //loop from 2 up to square root of n
      if (A[i]) {
        for (int j = i*i; j<=n; j+=i) {//loop j from i squared, by i each time
          A[j] = false; //set the multiples of i to be NOT prime
        }
      }
    }
    
    //Output: all i such that A[i] is true.
    //also, count the primes and output the number of them afterwards
    int numberOfPrimes = 0;
    for (int i=2; i<=n; i++) {
      if (A[i]) {
        //System.out.print(i + " ");
        numberOfPrimes++; //tally the current prime
      }
    }
    //System.out.println();
    System.out.println("Number of primes between 2 and " + n + " is " + numberOfPrimes);
  }
}