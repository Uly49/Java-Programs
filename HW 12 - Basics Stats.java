//complete the program
import java.util.Scanner;
import java.util.Arrays;

class BasicStats {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of values to input:");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the values:");
    for (int i=0; i<n; i++) {
      //System.out.println("Please enter value " + (i+1) + ":");
      arr[i] = input.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("Min: " + arr[0]);
    System.out.println("Max: " + arr[n-1]);
    System.out.println("Range: " + (arr[n-1]-arr[0]));
    int sum = 0;
    for (int i=0; i<n; i++) {
      sum += arr[i];
    }
    double average = sum*1.0/n;
    //System.out.println("The sum of the values in this array is: " + sum + ".");
    System.out.printf("Mean: %.1f%n", average);
    double summation = 0.0;
    for (int i=0; i<n; i++) {
      summation += Math.pow((arr[i]-average),2);
    }
    double radical = summation/n;
    double standardDeviation = Math.sqrt(radical);
    System.out.printf("Standard Deviation: %.1f%n", standardDeviation);
    //System.out.printf("%.1f%n", radical);
    //System.out.printf("%.1f%n", summation);
    input.close();
  }
}