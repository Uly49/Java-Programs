class RecursionIntro {
  public static void main(String[] args) {
    countUp(6);
  }
  
  //this recursive method counts from 1 to n (prints the numbers)
  public static void countUp(int n) {
    if (n > 1) { //recursive case
      countUp(n-1); //use recursion to do all but the last
      System.out.println(n); //finish the count
    }
    else if (n==1) { 
      System.out.println(1);
    }
  }
  
}