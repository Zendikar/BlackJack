/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tobias Mouer
 */
public class DeckOfCards {

    private ArrayList<Card> deck;
    public static final String[] types = {"spades", "clubs", "hearts", "diamonds"};

    public DeckOfCards() {
        deck = setupDeck();
    }

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    private ArrayList<Card> setupDeck() {
        ArrayList<Card> setup = new ArrayList<>();
        for (String s : DeckOfCards.types) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, s);
                setup.add(c);
            }
        }
        Collections.shuffle(setup);
        return setup;
    }

    public ArrayList<Card> drawCards(int amount) {
        ArrayList<Card> al = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {
            al.add(drawCard());
        }
        return al;
    }

    public Card drawCard() {
        Card c = deck.get(0);
        deck.remove(0);
        return c;
    }
}
