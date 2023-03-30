/*
 * a client to test the Card class
 */

import java.util.ArrayList;

class TestCards {
  public static void main(String[] args) {
    //create and print some sample Card objects
    Card x = new Card("2", "Hearts");
    Card y = new Card("queen", "diamonds");
    Card z = new Card("ace", "SPADES");
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    //Card w = new Card(14, "clubs"); //does not work, rank must be between 1-13
    //Card w = new Card(4, "clouds"); //does not work, suit must be valid
    
    //create an entire Deck and print it
    Deck myDeck = new Deck();
    System.out.println(myDeck);
    
    //shuffle the deck
    System.out.println("shuffling...");
    myDeck.shuffle();
    System.out.println(myDeck);
    
    //create two ArrayLists to store the "hands" of two players in a card game
    ArrayList<Card> player1hand = new ArrayList<Card>();
    ArrayList<Card> player2hand = new ArrayList<Card>();
    
    System.out.println("Dealing cards...");
    //alternatively deal cards to each player until each has five cards
    for (int i=1; i<=5; i++) {
      player1hand.add(myDeck.dealACard());
      player2hand.add(myDeck.dealACard());
    }
    
    //print each player's hand and the remaining deck
    System.out.println("Player 1's cards:");
    System.out.println(player1hand);
    System.out.println("Player 2's cards:");
    System.out.println(player2hand);
    System.out.println("Remaining cards in deck:");
    System.out.println(myDeck);
  }
}