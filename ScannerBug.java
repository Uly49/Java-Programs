/*
 * Investigating the Scanner bug
 * MCS 141
 */

import java.util.Scanner;

class ScannerBug {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name;
    int age;
    
    System.out.print("What is your age? ");
    age = in.nextInt();
    in.nextLine();//"Flush the extra new-line character before moving on
    System.out.print("What is your name? ");
    name = in.nextLine();
    System.out.printf("Hello %s, age %d\n", name, age);
  }
}