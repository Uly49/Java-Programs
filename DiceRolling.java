
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class diceRolling {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many times shall we run the trials?");
    int n = in.nextInt();
    int[] trials;
    int[] totalRolls;
    totalRolls = new int[n];
    trials = new int[13];
    for (int i = 0; i<n; i++) {
      int roll = 0;
      //int numberOfRolls = 0;
      while (roll != 7) {
        roll = rollDice();
        trials[roll]++;
        //numberOfRolls++;
        //System.out.println(trials[i]);
        totalRolls[i]++;
      }
    }
    double sum = 0;
    for (int i = 0; i<totalRolls.length; i++) {
      sum += totalRolls[i];
    }
    for (int i = 0; i<13; i++) {
      System.out.println("The frequency of " + i + " is " + trials[i] + " / " + sum +".");
    }
    double average = sum/n;
    System.out.println("The average number of rolls it took to roll a 7 is " + average);
    Arrays.toString (totalRolls);
    System.out.println("The number o times each number was rolled was:");
    Arrays.toString (trials);
    System.out.println("The number of rolls it took to get a 7 in each trial was:");
    System.out.println(Arrays.toString(totalRolls));
    System.out.println("The number of times each number was rolled was:");
    System.out.println(Arrays.toString(trials));
    
  }
  public static int rollDice() {
    Random randGen = new Random();
    int die1 = randGen.nextInt(6) + 1;
    int die2 = randGen.nextInt(6) + 1;
    return die1 + die2;
  }
}