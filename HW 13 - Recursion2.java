import java.util.Scanner;
class Recursion2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = s.nextInt();
    System.out.println("sum of digits =");
    System.out.println(sumOfDigits(n));
    s.close();
  }
  
  //complete the method according to the instructions
  //your method MUST be recursive!
  public static int sumOfDigits(int n) {
    //TODO
    int sum = 0;
    if (n>=10) {
      sum = sum + sumOfDigits(n/10);
    }
    return (n%10) + sum;
  }
}