/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import objects.Card;

/**
 *
 * @author Tobias Mouer
 */
public final class Deck {

    private ArrayList<Card> deck;
    public static final String[] types = {"spades", "clubs", "hearts", "diamonds"};

    public Deck() {
        deck = new ArrayList<>();
        addDeck();
    }

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    private ArrayList<Card> setup() {
        ArrayList<Card> setup = new ArrayList<>();
        for (String s : Deck.types) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, s);
                setup.add(c);
            }
        }
        Collections.shuffle(setup);
        return setup;
    }

    public ArrayList<Card> draw(int amount) {
        ArrayList<Card> al = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {
            Card c = deck.get(0);
            al.add(c);
            deck.remove(0);
        }
        return al;
    }
    public boolean checkIfEmpty(){
        return deck.isEmpty();
    }

    public ArrayList<Card> addDeck() {
        deck.addAll(setup());
        return deck;
    }

    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + '}';
    }

    public int getTotalValue(ArrayList<Card> hand) {
        return 0;
    }

}
