//complete the program
import java.util.Scanner;

class ArrayPractice4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i=0; i<5; i++) {
      arr[i] = input.nextInt();
    }
    for (int i=4; i>=0; i--) {
      System.out.println(arr[i]);
    }
    input.close();
  }
}