/*
 * program to assign "rewards" based on donation amount
 * each amount will receive awards at that level, as well as levels below
 */

import java.util.Scanner;

class Rewards {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the donated amount (an integer):");
    int donation = scn.nextInt();
    
    //assign rewards based on the donation
    System.out.println("Thank you for your generous donation!");
    System.out.println("At your level, you will receive, as a thank you:");
    
    if (donation <= 10) {//below $10 - a thank you
      System.out.println("Nothing");
    }
    
    if (donation >= 10) {//at least $10 - pencil
      System.out.println("An amazing pencil,, featuring: an eraser!");
    }
    if (donation >= 40) {//at least $40 - mug
      System.out.println("A mug to hold your favorite beverage.");
    }
    if (donation >= 100) {//at least $100 - tote bag
      System.out.println("A sturdy yet plain tote bag.");
    }
    if (donation >= 200) {//at least $200 - hoodie
      System.out.println("A one size fits most hoodie.");
    }
    if (donation >= 1000) {//at least $1000 - lunch with professor
      System.out.println("A trip to decadent McDonald's with your CS professor.");
    }
    
  }
}