//complete the program
import java.util.Scanner;


class ArrayPractice3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i=0; i<5; i++) {
      arr[i] = input.nextInt();
    }
    System.out.print("{");
    for (int i=0; i<4; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println(arr[4] + "}");
    input.close();
  }
}