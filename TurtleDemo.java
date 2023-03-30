import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class TurtleDemo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    System.out.println("How many turtles should we make?");
    int n = s.nextInt();
    s.close();
    ArrayList<Turtle> myPets = new ArrayList<Turtle>(n);
    for (int i=1; i<=n; i++) {
      Turtle myrtle = new Turtle(r.nextDouble(), r.nextDouble(), r.nextDouble()*360);
      myPets.add(myrtle);
    }
    while (true) {
     //make the turtles walk
      for (Turtle myrtle : myPets) {
        myrtle.goForward(r.nextDouble()*0.01);
        myrtle.turnLeft(r.nextDouble()*360);
      }
      StdDraw.pause(10);
    }
  }
}