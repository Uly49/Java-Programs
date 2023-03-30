/*
 * this class is used to represent a standard playing card
 * each card has a rank and a suit as usual
 */

class Card {
  //constant listing of the possible suits for reference
  public static final String[] ALL_SUITS = {"clubs", "diamonds", "hearts", "spades"};
  public static final String[] ALL_RANKS 
    = {null, "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
  
  //data variables
  //because they are final, they will be "immutable", cannot be changed once set
  private final int rank; //should be 1-13 where ace=1, jack=11, queen=12, king=13
  private final String suit; //should be either "clubs", "diamonds", "hearts", or "spades"
  
  
  //constructor
  //takes in an int for the rank and a String for the suit
  public Card(String rank, String suit) {
    boolean isValidRank = false;
    int temp1 = 0;
    for (int i=1; i<=13; i++) {
      if (ALL_RANKS[i].equalsIgnoreCase(rank)) {
        temp1 = i; //assign the parameter value to the data variable
        isValidRank = true;
      }
    }
    if (isValidRank) {
      this.rank = temp1;
    }
    else {
      throw new IllegalArgumentException("rank must be between 1-13");
    }
    boolean isValidSuit = false;
    String temp2 = "";
    for (String x : ALL_SUITS) {
      if (x.equalsIgnoreCase(suit)) {
        //given suit matches one of the four possible suits
        temp2 = suit.toLowerCase(); //store the valid suit in lower case only
        isValidSuit = true;
      }
    }
    if (!isValidSuit) {
      throw new IllegalArgumentException("suit must be one of the four valid suits.");
    }
    else {
      this.suit = temp2;
    }
    
  }
  
  //this method overrides the default for creating a printable representation
  public String toString() {
    if (rank >= 2 && rank <=10) {
      return rank + " of " + suit;
    }
    else if (rank == 1) {
      return "Ace of " + suit;
    }
    else if (rank == 11) {
      return "Jack of " + suit;
    }
    else if (rank == 12) {
      return "Queen of " + suit;
    }
    else if (rank == 13) {
      return "King of " + suit;
    }
    else {
      //this should never happen
      throw new RuntimeException("invalid rank in Card: " + rank);
    }
  }
  
  //"getter" or "accessor" method for the client to access the rank and the suit
  public String getRank() {
    return ALL_RANKS[rank];
  }
  
  public String getSuit() {
    return suit;
  }
}