/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version1;

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

    public void setHand(HandOfCards hand) {
        this.hand = hand;
    }
    
    
}
