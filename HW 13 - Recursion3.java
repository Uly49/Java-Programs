import java.util.Scanner;
class Recursion3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = s.nextInt();
    System.out.println("In base 12, n =");
    System.out.println(toBase12(n));
    s.close();
  }
  
  //complete the method according to the instructions
  //your method MUST be recursive!
  public static String toBase12(int n) {
    //TODO
    if (n<10) {
      return "" + n;
    }
    else if (n==10) {
      return "A";
    }
    else if (n==11) {
      return "B";
    }
    else {
      return toBase12(n/12) + toBase12(n%12);
    }
  }
}