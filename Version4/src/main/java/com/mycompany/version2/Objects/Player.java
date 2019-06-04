/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version2.Objects;

import com.mycompany.version2.Lists.HandOfCards;
import java.util.ArrayList;

/**
 *
 * @author Tobias Mouer
 */
public class Player {

    private String name;
    private HandOfCards hand;
    private double coins = 100;
    private double currentBet;

    public Player(String name) {
        this.name = name;
        hand = new HandOfCards();
    }

    public Player(String name, HandOfCards hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HandOfCards getHand() {
        return hand;
    }

    public int getHandValue() {
        return hand.getTotalValue();
    }

    public void setHand(ArrayList<Card> hand) {
        hand.forEach((c) -> {
            this.hand.addCard(c);
        });
    }

    public double getCoins() {
        return coins;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }

    public void addCoins(boolean wins) {
        if (wins) {
            coins = coins + currentBet;
        } else {
            coins = coins - currentBet;
        }
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }

    public double getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(double currentBet) {
        this.currentBet = currentBet;
    }

}
