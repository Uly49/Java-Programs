import java.util.Scanner;

class length {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean repeat = true;
    System.out.println("1 = Inch");
    System.out.println("2 = Foot");
    System.out.println("3 = Yard");
    System.out.println("4 = Mile");
    System.out.println("5 = Nanometer");
    System.out.println("6 = Micrometer");
    System.out.println("7 = Millimeter");
    System.out.println("8 = Centimeter");
    System.out.println("9 = Meter");
    System.out.println("10 = Kilometer");
    while (repeat) {
      System.out.println("Which length scale would you like to convert FROM?");
      int scale1 = in.nextInt();
      System.out.println("Which length scale would you like to convert TO?");
      int scale2 = in.nextInt();
      if ((scale1 == 1)&&(scale2 == 2)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double foot = inch / 12.0;
        System.out.println(inch + " inches is " + foot + " feet");
      }
      if ((scale1 == 1)&&(scale2 == 3)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double yard = inch / 36.0;
        System.out.println(inch + " inches is " + yard + " yards");
      }
      if ((scale1 == 1)&&(scale2 == 4)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double mile = inch / 63360.0;
        System.out.println(inch + " inches is " + mile + " miles");
      }
      if ((scale1 == 1)&&(scale2 == 5)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double nanometer = inch * 25400000.0;
        System.out.println(inch + " inches is " + nanometer + " nanometers");
      }
      if ((scale1 == 1)&&(scale2 == 6)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double micrometer = inch / 25400.0;
        System.out.println(inch + " inches is " + micrometer + " micrometers");
      }
      if ((scale1 == 1)&&(scale2 == 7)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double millimeter = inch / 25.4;
        System.out.println(inch + " inches is " + millimeter + " millimeters");
      }
      if ((scale1 == 1)&&(scale2 == 8)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double centimeter = inch / 2.54;
        System.out.println(inch + " inches is " + centimeter + " centimeters");
      }
      if ((scale1 == 1)&&(scale2 == 9)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double meter = inch / 39.37;
        System.out.println(inch + " inches is " + meter + " meters");
      }
      if ((scale1 == 1)&&(scale2 == 10)) {
        System.out.println("Enter Inch length:");
        double inch = in.nextDouble();
        double kilometer = inch / 39370;
        System.out.println(inch + " inches is " + kilometer + " kilometers");
      }
      if ((scale1 == 2)&&(scale2 == 1)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double inch = foot * 12.0;
        System.out.println(foot + " feet is " + inch + " inches");
      }
      if ((scale1 == 2)&&(scale2 == 3)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double yard = foot / 3.0;
        System.out.println(foot + " feet is " + yard + " yards");
      }
      if ((scale1 == 2)&&(scale2 == 4)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double mile = foot / 5280.0;
        System.out.println(foot + " feet is " + mile + " miles");
      }
      if ((scale1 == 2)&&(scale2 == 5)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double nanometer = foot * 304800000.0;
        System.out.println(foot + " feet is " + nanometer + " nanometers");
      }
      if ((scale1 == 2)&&(scale2 == 6)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double micrometer = foot * 304800.0;
        System.out.println(foot + " feet is " + micrometer + " micrometers");
      }
      if ((scale1 == 2)&&(scale2 == 7)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double millimeter = foot * 304.8;
        System.out.println(foot + " feet is " + millimeter + " millimeters");
      }
      if ((scale1 == 2)&&(scale2 == 8)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double centimeter = foot * 30.48;
        System.out.println(foot + " feet is " + centimeter + " centimeters");
      }
      if ((scale1 == 2)&&(scale2 == 9)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double meter = foot * .3048;
        System.out.println(foot + " feet is " + meter + " meters");
      }
      if ((scale1 == 2)&&(scale2 == 10)) {
        System.out.println("Enter Foot length:");
        double foot = in.nextDouble();
        double kilometer = foot * .0003048;
        System.out.println(foot + " feet is " + kilometer + " kilometers");
      }
      if ((scale1 == 3)&&(scale2 == 1)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double inch = yard * 36;
        System.out.println(yard + " yards is " + inch + " inches");
      }
      if ((scale1 == 3)&&(scale2 == 2)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double foot = yard * 3.0;
        System.out.println(yard + " yards is " + foot + " feet");
      }
      if ((scale1 == 3)&&(scale2 == 4)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double meter = yard / 1760.0;
        System.out.println(yard + " yards is " + meter + " meters");
      }
      if ((scale1 == 3)&&(scale2 == 5)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double nanometer = yard * 914400000.0;
        System.out.println(yard + " yards is " + nanometer + " nanometers");
      }
      if ((scale1 == 3)&&(scale2 == 6)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double micrometer = yard * 914400.0;
        System.out.println(yard + " yards is " + micrometer + " micrometers");
      }
      if ((scale1 == 3)&&(scale2 == 7)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double millimeter = yard * 914.4;
        System.out.println(yard + " yards is " + millimeter + " millimeters");
      }
      if ((scale1 == 3)&&(scale2 == 8)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double centimeter = yard * 91.44;
        System.out.println(yard + " yards is " + centimeter + " centimeters");
      }
      if ((scale1 == 3)&&(scale2 == 9)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double meter = yard * .9144;
        System.out.println(yard + " yards is " + meter + " meters");
      }
      if ((scale1 == 3)&&(scale2 == 10)) {
        System.out.println("Enter Yard length:");
        double yard = in.nextDouble();
        double kilometer = yard * .0009144;
        System.out.println(yard + " yards is " + kilometer + " kilometers");
      }
      if ((scale1 == 4)&&(scale2 == 1)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double inch = mile * 63360.0;
        System.out.println(mile + " miles is " + inch + " inches");
      }
      if ((scale1 == 4)&&(scale2 == 2)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double foot = mile * 5280.0;
        System.out.println(mile + " miles is " + foot + " feet");
      }
      if ((scale1 == 4)&&(scale2 == 3)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double yard = mile * 1760.0;
        System.out.println(mile + " miles is " + yard + " yards");
      }
      if ((scale1 == 4)&&(scale2 == 5)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double nanometer = mile * 1609000000000.0;
        System.out.println(mile + " miles is " + nanometer + " nanometers");
      }
      if ((scale1 == 4)&&(scale2 == 6)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double micrometer = mile * 1609000000.0;
        System.out.println(mile + " miles is " + micrometer + " micrometers");
      }
      if ((scale1 == 4)&&(scale2 == 7)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double millimeter = mile * 1609000.0;
        System.out.println(mile + " miles is " + millimeter + " millimeters");
      }
      if ((scale1 == 4)&&(scale2 == 8)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double centimeter = mile * 160934.0;
        System.out.println(mile + " miles is " + centimeter + " centimeters");
      }
      if ((scale1 == 4)&&(scale2 == 9)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double meter = mile * 1609.34;
        System.out.println(mile + " miles is " + meter + " meters");
      }
      if ((scale1 == 4)&&(scale2 == 10)) {
        System.out.println("Enter Mile length:");
        double mile = in.nextDouble();
        double kilometer = mile * 1.60934;
        System.out.println(mile + " miles is " + kilometer + " kilometers");
      }
      if ((scale1 == 8)&&(scale2 == 9)) {
        System.out.println("Enter Centimeter length:");
        double centimeter = in.nextDouble();
        double meter = centimeter / 100.0;
        System.out.println(centimeter + " centimeters is " + meter + " meters");
      }
      if ((scale1 == 7)&&(scale2 == 9)) {
        System.out.println("Enter Millimeter length:");
        double millimeter = in.nextDouble();
        double meter = millimeter / 1000.0;
        System.out.println(millimeter + " millimeters is " + meter + " meters");
      }
    }
    in.close();
  }
}