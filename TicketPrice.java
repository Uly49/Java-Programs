//TODO: write your program according to the instructions
import java.util.Scanner;

class TicketPrice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int adult = 10;
    int child = 5;
    int senior = 8;
    System.out.println("Welcome to the movie theater!");
    System.out.println("What type of ticket are you buying?");
    System.out.println("1 - Adult $10 per ticket");
    System.out.println("2 - Child $5 per ticket");
    System.out.println("3 - Senior Citizen $8 per ticket");
    System.out.println("Enter your option:");
    int type = in.nextInt();
    int price = 0;
    if (type == 1) {
      price = 10;}
    else if (type == 2) {
      price = 5;}
    else if (type == 3) {
      price = 8;}
    System.out.println("Do you want tickets for the matinee show? (y or n)");
    String matineeAnswer = in.next();
    if (matineeAnswer.equals("y")) {
      price = price - 2;}
    System.out.println("Are you a rewards club member? (y or n)");
    String rewardsAnswer = in.next();
    if (rewardsAnswer.equals("y")) {
      price = price - 1;}
    System.out.println("How many tickets are you buying?");
    int tickets = in.nextInt();
    price = tickets * price;
    System.out.println("Your total is $" + price);
    in.close();
  }
}