/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version2.Lists;

import com.mycompany.version2.Objects.Card;
import java.util.ArrayList;

/**
 *
 * @author Tobias Mouer
 */
public class HandOfCards {

    private ArrayList<Card> hand;
    private int playerId;

    public HandOfCards(ArrayList<Card> hand, int playerId) {
        this.hand = hand;
        this.playerId = playerId;
    }

    public HandOfCards() {
        hand = new ArrayList<>();
    }

    public HandOfCards(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public HandOfCards(int playerId) {
        this.playerId = playerId;
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return hand.toString();
    }

    public int getTotalValue() {
        int totalValue = 0;
        for (int i = 0; i < hand.size(); i++) {
            totalValue = totalValue + hand.get(i).getValue();
        }
        if (totalValue <= 11 && containsAce()) {
            totalValue = totalValue + 10;
        }
        return totalValue;
    }

    private boolean containsAce() {
        return hand.stream().anyMatch((c) -> (c.getValue() == 1));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    public Boolean addCard(Card c) {
        return hand.add(c);
    }
}
