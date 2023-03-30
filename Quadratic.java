import java.util.Scanner;

class Quadratic {
  public static void main(String[] args) {
    //write your code here
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the coefficients of a quadratic equation:");
    double coefficient1 = scnr.nextDouble();
    double coefficient2 = scnr.nextDouble();
    double coefficient3 = scnr.nextDouble();
    
    double radical = Math.sqrt((Math.pow(coefficient2, 2.0)) - 4.0 * coefficient1 * coefficient3);
    
    double numeratorPlus = -coefficient2 + radical;
    
    double root1 = numeratorPlus / (2.0 * coefficient1);
    
    double numeratorNegative = -coefficient2 - radical;
    
    double root2 = numeratorNegative / (2.0 * coefficient1);
    
    System.out.println("Roots are:");
    
    if (root1 <= root2) {
      System.out.printf("%.3f\n", root1);
      System.out.printf("%.3f\n", root2);
    }
    else {
      System.out.printf("%.3f\n", root2);
      System.out.printf("%.3f\n", root1);
    }
    
  }  
}