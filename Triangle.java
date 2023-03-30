import java.util.Scanner;

class Triangle {
  /*
   * the main method
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the three side lengths of a triangle:");
    double firstSide = in.nextDouble();
    double secondSide = in.nextDouble();
    double thirdSide = in.nextDouble();
    
    //call the perimeter method below
    perimeter(firstSide,secondSide,thirdSide);
    double a = firstSide;
    double b = secondSide;
    double c = thirdSide;
    
    //call the area method below
    area(firstSide, secondSide, thirdSide);

    
  } //end of main method
  
  /*
   * a method that prints the perimeter of a triangle, rounded to 2 decimals
   * takes in the three side lengths as parameters
   */
  public static void perimeter(double a, double b, double c) {
    //TODO: complete the code for this method
    
    
  } //end of perimeter method
  
  /*
   * a method that prints the area of a triangle, rounded to 2 decimals
   * takes in the three side lengths as parameters
   */
  
  //TODO: create the method and complete it below.
  //The method should be called area()
  public static void area() { 
     double area = a + b + c;
     System.out.println(area);
  }
} //end of Triangle class