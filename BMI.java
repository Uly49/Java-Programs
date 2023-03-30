//TODO: write the program following the instructions
import java.util.Scanner;

class BMI {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter weight in pounds (lb):");
    double weightInPounds = in.nextDouble();
    double weightInKilograms = weightInPounds * 0.4536;
    System.out.println("Enter height in inches (in):");
    double heightInInches = in.nextDouble();
    double heightInMeters = heightInInches * 0.0254;
    double bmi = weightInKilograms / (Math.pow(heightInMeters,2.0));
    System.out.printf("BMI = %.1f\n", bmi);
    if ( bmi < 18.5 ) {
      System.out.println("Underweight");}
    else if ( bmi <= 24.9 ) {
      System.out.println("Normal");}
    else if ( bmi <= 29.9 ) {
      System.out.println("Overweight");}
    else if ( bmi > 30 ) {
      System.out.println("Obese");}
    //System.out.println(weightInKilograms);
    //System.out.println(heightInMeters);
    in.close();
  }
}