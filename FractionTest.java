import java.util.Random;
import java.util.Arrays;

class FractionTest {
  public static void main(String[] args) {
    Fraction x = new Fraction(-1, 5); //calls the constructor to make a 1/2 Fraction object
    Fraction y = new Fraction(-3, 5); //calls the constructor to make a -3/5 Fraction object
    
//    try {
//      Fraction z = new Fraction(0, 5); //this should NOT be allowed, zero denominator
//    } catch (IllegalArgumentException e) {
//      System.out.println("never mind. just kidding. I didn't want z anyway.");
//    }
    
    Fraction z = new Fraction(0,-8); //this is essentially 0
    Fraction w = new Fraction(30,6); //this is essentially 5
    
    //print out each object
    System.out.println("x = " + x);
    System.out.println("...which is = " + x.toDouble());
    System.out.println("y = " + y);
    System.out.println("...which is = " + y.toDouble());
    System.out.println("z = " + z);
    System.out.println("...which is = " + z.toDouble());
    System.out.println("w = " + w);
    System.out.println("...which is = " + w.toDouble());
    
    //multiply x by y and print the result
    Fraction product = x.times(y);
    System.out.println("x * y = " + product);
    
     //divide x by y and print the result
    Fraction quotient = x.dividedBy(y);
    System.out.println("x / y = " + quotient);
    
    //add x and y and print the result
    Fraction sum = x.plus(y);
    System.out.println("x + y = " + sum);
    
    //subtract x minus y and print the result
    Fraction difference = x.minus(y);
    System.out.println("x - y = " + difference);
    
    //the following code does not work because > is NOT defined for Fraction objects
    //we need to come up with our own way of comparing to Fraction objects and 
    //provide a method for this
    //if (x>y) {
    //  System.out.println("x is greater than y");
    //}
    
    Fraction[] randFracs = new Fraction[30];
    Random r = new Random();
    for (int i=0; i<randFracs.length; i++) {
      int n = r.nextInt(201)-100; //generate a numerator between -100 and 100
      int d = r.nextInt(100)+1; //random denominator between 1 and 100
      Fraction f = new Fraction(n,d);
      randFracs[i] = f;
    }
    
    System.out.println("Random fractions:");
    System.out.println(Arrays.toString(randFracs));
    //sort all the Fractions
    Arrays.sort(randFracs);
    System.out.println(Arrays.toString(randFracs));
    
    
  }
}