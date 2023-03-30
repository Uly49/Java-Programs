import java.util.Scanner;

class Temp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean repeat = true;
    System.out.println("1 = Fahrenheit");
    System.out.println("2 = Celcius");
    System.out.println("3 = Kelvin");
    while (repeat) {
      System.out.println("Which temperature scale would you like to convert FROM?");
      int scale1 = in.nextInt();
      System.out.println("Which temperature scale would you like to convert TO?");
      int scale2 = in.nextInt();
      if ((scale1 == 1)&&(scale2 == 2)) {
        System.out.println("Enter Fahrenheit temperature:");
        double fahrenheit = in.nextDouble();
        double celsius = (fahrenheit - 32)*(5.0/9.0);
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");
      }
      if ((scale1 == 1)&&(scale2 == 3)) {
        System.out.println("Enter Fahrenheit temperature:");
        double fahrenheit = in.nextDouble();
        double kelvin = ((fahrenheit - 32)*(5.0/9.0)) + 273.15;
        System.out.println(fahrenheit + " degrees Fahrenheit is " + kelvin + " degrees Kelvin");
      }
      if ((scale1 == 2)&&(scale2 == 1)) {
        System.out.println("Enter Celsius temperature:");
        double celsius = in.nextDouble();
        double fahrenheit = (celsius*(9.0/5.0)) + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
      }
      if ((scale1 == 2)&&(scale2 == 3)) {
        System.out.println("Enter Celsius temperature:");
        double celsius = in.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " degrees Celsius is " + kelvin + " degrees Kelvin");
      }
      if ((scale1 == 3)&&(scale2 == 1)) {
        System.out.println("Enter Kelvin temperature:");
        double kelvin = in.nextDouble();
        while (kelvin < 0) {
          System.out.println("Invalid Kelvin temperature entered.");
          System.out.println("Enter Kelvin temperature:");
          kelvin = in.nextDouble();
        }
        double fahrenheit = ((kelvin - 273.15)*(9.0/5.0)) + 32;
        System.out.println(kelvin + " degrees Kelvin is " + fahrenheit + " degrees Fahrenheit");
      }
      if ((scale1 == 3)&&(scale2 == 2)) {
        System.out.println("Enter Kelvin temperature:");
        double kelvin = in.nextDouble();
        while(kelvin < 0) {
          System.out.println("Invalid Kelvin temperature entered.");
          System.out.println("Enter Kelvin temperature:");
          kelvin = in.nextDouble();
        }
        double celsius = kelvin - 273.15;
        System.out.println(kelvin + " degrees Kelvin is " + celsius + " degrees Celsius");
      }
    }
    in.close();
  }
}