//imported Scanner for user input and ArrayLists
import java.util.*;

class cards {
    // declared and initialized instance fields for ArrayLists
    // ArrayList for the basic and organized deck of cards
    public ArrayList<card> deck = new ArrayList<card>();
    // ArrayList for the shuffled deck of cards
    public ArrayList<card> shuf = new ArrayList<card>();

    // constructor for the Cards class
    public cards() {
        // called setDeck() method to set the deck with 52 cards
        setDeck();
    }

    /**
     * This method sets ArrayList deck by adding each of the 52 cards in a basic
     * deck.
     */
    public void setDeck() {
        deck.add(new card("AH", 11)); deck.add(new card("AS", 11)); deck.add(new card("AC", 11)); deck.add(new card("AD", 11));
        deck.add(new card("JH", 10)); deck.add(new card("JS", 10)); deck.add(new card("JC", 10)); deck.add(new card("JD", 10));
        deck.add(new card("QH", 10)); deck.add(new card("QS", 10)); deck.add(new card("QC", 10)); deck.add(new card("QD", 10));
        deck.add(new card("KH", 10)); deck.add(new card("KS", 10)); deck.add(new card("KC", 10)); deck.add(new card("KD", 10));
        deck.add(new card("2H", 2)); deck.add(new card("2S", 2)); deck.add(new card("2C", 2)); deck.add(new card("2D", 2));
        deck.add(new card("3H", 3)); deck.add(new card("3S", 3)); deck.add(new card("3C", 3)); deck.add(new card("3D", 3));
        deck.add(new card("4H", 4)); deck.add(new card("4S", 4)); deck.add(new card("4C", 4)); deck.add(new card("4D", 4));
        deck.add(new card("5H", 5)); deck.add(new card("5S", 5)); deck.add(new card("5C", 5)); deck.add(new card("5D", 5));
        deck.add(new card("6H", 6)); deck.add(new card("6S", 6)); deck.add(new card("6C", 6)); deck.add(new card("6D", 6));
        deck.add(new card("7H", 7)); deck.add(new card("7S", 7)); deck.add(new card("7C", 7)); deck.add(new card("7D", 7));
        deck.add(new card("8H", 8)); deck.add(new card("8S", 8)); deck.add(new card("8C", 8)); deck.add(new card("8D", 8));
        deck.add(new card("9H", 9)); deck.add(new card("9S", 9)); deck.add(new card("9C", 9)); deck.add(new card("9D", 9));
        deck.add(new card("10H", 10)); deck.add(new card("10S", 10)); deck.add(new card("10C", 10)); deck.add(new card("10D", 10));

        //calls the shuffle method to shuffle the deck of cards
        shuffle();
    }

    // returns arraylist of shuffled cards
    public ArrayList<card> getShuf(){
        return shuf;
    }

    /**
     * This method shuffles the deck of cards by removing the cards from the
     * original ArrayList of cards and adding it to another, shuffled, deck.
     * Utilized a random number between 0 and the size of the deck. the random
     * number becomes the index of the card that will be removed from the sorted
     * deck and added to the shuffled deck.This shuffles the deck because cards are
     * removed from random indexes and added to the end of the ArrayList shuf
     */
    public void shuffle() {
        shuf = new ArrayList<card>();
        // utilized a while loop to continue finding and removing cards until the original
        // sorted deck is empty
        while (!deck.isEmpty()) {
            shuf.add(deck.remove((int) (Math.random() * deck.size())));
        }

        //return shuf;
    }

    /**
     * gets the value of each card in the hand and adds them together
     * if teh user has aces and is over 21, their score will get subtracted 10 for each
     * ace they have until they are under 21
     * @param u1 - the hand of cards
     * @return - returns the sum of the cards
     */
    public int calcScore(card[] u1) {
        int sum = 0;
        for (card i : u1) {
            sum += i.getValue();
        }
        for (int i = 0; i < u1.length; i++) {
            if (sum > 21 && u1[i].getValue() == 11) {
                u1[i].value = 1;
                sum -= 10;
            }
        }
        return sum;
    }
}