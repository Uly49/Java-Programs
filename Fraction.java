/*
 * This class represents a rational number (a fraction) with
 * integer numerator and denominator
 * It defines the operations (methods) that can be used with a
 * fraction object
 */

class Fraction implements Comparable<Fraction> {
  //data: the integers representing the numerator and denominator of
  //a given fraction object
  //these are private instance variables so they exist in each and every
  //object (a new copy in each one) but can only be accessed by code
  //in this class
  private int numerator;
  private int denominator;
  
  //methods: operations for using, accessing, changing the objects of this class type
  
  //constructors
  //this constructor will take in two int values and use them as the
  //initial numerator and denominator, respectively
  //e.g., new Fraction(3,5) will create the Fraction representing 3/5
  public Fraction(int n, int d) {
    if (d==0) { //denominator can NOT be 0, this is an invalid argument to the constructor
      throw new IllegalArgumentException("Fraction cannot be made with 0 denominator.");
    }
    else if (n==0) { //numerator of 0 -> store as 0/1
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = n;
      denominator = d;
      if (denominator < 0) { //negative denominator, "move the negative up"
        numerator = -numerator;
        denominator = -denominator;
      }
      int divisor = gcd(numerator, denominator); //call the helper method below
      numerator /= divisor;
      denominator /= divisor;
    }
  }
  
  /*
   * this method implements the method of the Comparable interface
   * returns -1 when the calling object Fraction is less than the other object
   * returns 0 when they are equal
   * returns 1 when the calling object Fraction is greater than the other object
   */
  public int compareTo(Fraction o) {
    double x = this.toDouble(); //converts "this" object, the calling object, to a decimal
    double y = o.toDouble(); //converts other object to a decimal
    if (x < y) {
      return -1;
    }
    else if (x > y) {
      return 1;
    }
    else {
      return 0;
    }
  }
  
  
  //method to give a printable representation of the Fraction object
  //over-ride the method from the Java default provided version
  public String toString() {
    if (denominator != 1) {
      return numerator + "/" + denominator;
    }
    else {
      //denominator of 1 means the Fraction is actually an integer
      //so just return the numerator String
      return "" + numerator;
    }
  }
  
  //some basic arithmetic methods
  
  //this method multiplies the given parameter Fraction, other, to "this" Fraction
  //"this" Fraction is the calling object
  //returns a new Fraction representing the product
  public Fraction times(Fraction other) {
    //multiply this numerator by other numerator
    int numeratorResult = numerator * other.numerator;
    //multiply this denominator by other denominator
    int denominatorResult = denominator * other.denominator;
    //call constructor to build the result
    return new Fraction(numeratorResult, denominatorResult);
  }
  
  public Fraction dividedBy(Fraction other) {
    int numeratorResult = numerator * other.denominator;
    int denominatorResult = denominator * other.numerator;
    return new Fraction(numeratorResult, denominatorResult);
  }
  
  public Fraction plus(Fraction other) {
    int numeratorResult = numerator * other.denominator 
      + other.numerator * denominator;
    int denominatorResult = denominator * other.denominator;
    return new Fraction(numeratorResult, denominatorResult);
  }
  
  public Fraction minus(Fraction other) {
    int numeratorResult = numerator * other.denominator 
      - other.numerator * denominator;
    int denominatorResult = denominator * other.denominator;
    return new Fraction(numeratorResult, denominatorResult);
  }
  
  /*
   * this method returns the equivalent decimal of the Fraction
   */
  public double toDouble() {
    return (double) numerator/denominator;
  }
  
  /*
   * this is a private "helper" method
   * used to find the greatest common divisor for reducing a fraction to lowest terms
   * given a,b it finds the greatest common divisor of |a| and |b|
   */
  private int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    if (b > a) { //swap if necessary so that a is the larger
      int temp = a;
      a = b;
      b = temp;
    }
    int r = a%b; //compute remainder
    if (r == 0) {
      return b; //b is the greatest common divisor of a and b because b divides a
    }
    else {
      //remainder is not 0, use Euclid's algorithm
      return gcd(b, r);
    }
  }
  
}