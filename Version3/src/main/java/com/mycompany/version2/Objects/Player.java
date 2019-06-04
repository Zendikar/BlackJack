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

    public void setHand(ArrayList<Card> hand) {
        hand.forEach((c) -> {
            this.hand.addCard(c);
        });
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }

}
