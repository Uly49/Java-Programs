class SimpleLoops {
  public static void main(String[] args) {
    //use a while loop to print out a table of values
    //display the perfect squars from 1 to 20 squared
    int i = 1;
    while (i <= 20) {
      System.out.println(i + " squared is " + i*i);
      i++;
    }
    
    //do it again using a for-loop instead
    //note: variable i is still in scope so use j instead
    for (int j = 1; j <= 20; j++) {
      System.out.println(j + " squared is " + j*j);
    }
  }
}