import java.util.Scanner;
class Recursion1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = s.nextInt();
    System.out.println("f(n)=");
    System.out.println(f(n));
    s.close();
  }
  
  //complete the method according to the instructions
  //your method MUST be recursive!
  public static int f(int n) {
    //TODO
    if (n==1) {
      return 1;
    }
    else if ((n%2) == 0) {
      return n + f(n-1);
    }
    else {
      return n*f(n-1);
    }
  }
}