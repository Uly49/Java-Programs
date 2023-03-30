import java.util.*;
public class Mystery {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("type in a word (only letters, please): ");
    String x = keyboard.next();
    Random r = new Random();
    char a[] = new char[x.length()];
    char b[] = new char[x.length()];
    
    for (int i = 0; i<x.length(); i++) {
      a[i] = x.charAt(i);
    }
    
    int i = 0;
    while (i<b.length) {
      int y = r.nextInt(x.length());
      char c = a[y];
      if (c != 'x') {
        b[i] = c;
        i++;
        a[y] = 'x';
      }
    }
    
    for (int j = 0; j<b.length; j++) {
      System.out.print(b[j]);
    }
    keyboard.close();
  }
}