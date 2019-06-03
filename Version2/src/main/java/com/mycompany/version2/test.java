/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version2;

import com.mycompany.version2.Handlers.GameHandler;
import com.mycompany.version2.Lists.HandOfCards;
import com.mycompany.version2.Lists.DeckOfCards;
import com.mycompany.version2.Objects.Player;

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
        System.out.println(p);

        Player dealer = new Player("Dealer");
        HandOfCards dealerHand = new HandOfCards(deck.drawCards(2));
        dealer.setHand(dealerHand);
        System.out.println(dealer);

        System.out.println(p.getHand().getTotalValue());
        System.out.println(dealer.getHand().getTotalValue());
        p.getHand().addCard(deck.drawCard());
        System.out.println(p);
        System.out.println(p.getHand().getTotalValue());
        GameHandler gh = new GameHandler();
        System.out.println(gh.CalculateHands(p, dealer));
    }
}
