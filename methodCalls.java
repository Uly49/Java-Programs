/*
 * Class notes 9/11
 * MCS 141
 * Ulysses Palomar
 */

class methodCalls{
  public static void zoop() {
    baffle(); //goes to baffle method
    System.out.print("You wugga ");
    baffle(); //goes to baffle method
  }
  public static void main(String[] args) {
    //main method is always the first method, where the code starts
    System.out.print("No, I ");
    zoop(); //goes to zoop method
    System.out.print("I ");
    baffle(); //goes to baffle method
  }
  public static void baffle() {
    System.out.print("wug");
    ping(); // goes to ping method
  }
  public static void ping() {
    System.out.println(".");
  }
}