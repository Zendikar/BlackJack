/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version1;

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
        return "Hand: " +hand.toString();
    }
    
    
}
