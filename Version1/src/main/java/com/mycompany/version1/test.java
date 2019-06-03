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
public class test {
    public static void main(String[] args) {
        Player p = new Player("Tobias");
        System.out.println(p.getName());
        DeckOfCards deck = new DeckOfCards();
        HandOfCards hand = new HandOfCards(deck.drawCards(2));
        p.setHand(hand);
        System.out.println(p.getHand());
    }
}
