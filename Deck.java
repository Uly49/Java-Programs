/*
 * this class represents a standard, 52-card deck of cards
 */

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.NoSuchElementException;


class Deck {
  //deck is made up of an array to hold 52 Card objects
  //private Card[] cards;
  private ArrayList<Card> cards;
  
  //constructor to build the Deck by creating all 52 Card objects and the array
  public Deck() {
    //cards = new Card[52]; //create the array to store 52 Card objects
    cards = new ArrayList<Card>(52); //new ArrayList with capacity for 52 Card objects
    //int count = 0;
    for (int i=1; i<Card.ALL_RANKS.length; i++) {
      String rank = Card.ALL_RANKS[i];
      for (String suit : Card.ALL_SUITS) {
        //cards[count] = new Card(rank,suit); //add the new Card to the array
        cards.add(new Card(rank,suit));
        //count++; //move on to next spot
      }
    }
  }
  
  //return a String of the entire Deck
  public String toString() {
    return cards.toString();
  }
  
  //this method "shuffles" the Deck by randomizing the order of the
  //Card objects in the array
  public void shuffle() {
    Random randGen = new Random();
    for (int i=0; i<cards.size(); i++) {
      int randomSpot = randGen.nextInt(cards.size());
      Card temp = cards.get(i);
      cards.set(i, cards.get(randomSpot));
      cards.set(randomSpot, temp);
    }
  }
  
  //removes a Card from the Deck and returns it
  //Card is removed from the "top of the deck", i.e., first spot in the ArrayList
  public Card dealACard() {
    if (cards.size() > 0) {
      return cards.remove(0);
    }
    else { //no Card to deal
      throw new NoSuchElementException("Deck is empty.");
    }
  }
}