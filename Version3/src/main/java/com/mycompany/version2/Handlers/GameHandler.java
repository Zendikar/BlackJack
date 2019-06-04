/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version2.Handlers;

import com.mycompany.version2.Lists.*;
import com.mycompany.version2.Objects.*;
import java.util.ArrayList;

/**
 *
 * @author Tobias Mouer
 */
public class GameHandler {

    private DeckOfCards deck;
    private ArrayList<Player> playerList;

    public GameHandler(DeckOfCards deck, ArrayList<Player> playerList) {
        this.deck = deck;
        this.playerList = playerList;
    }

    public GameHandler() {
        deck = new DeckOfCards();
        playerList = new ArrayList<>();
        playerList.add(new Player("Dealer"));
        playerList.add(new Player("Tobias"));
    }

    public String CalculateHands(Player p1, Player p2) {
        if (p1.getHand().getTotalValue() > 21) {
            return p2.getName() + " wins";
        }
        if (p2.getHand().getTotalValue() > 21) {
            return p1.getName() + " wins";
        }
        if (p1.getHand().getTotalValue() > p2.getHand().getTotalValue()) {
            return p1.getName() + " wins";
        }
        if (p1.getHand().getTotalValue() < p2.getHand().getTotalValue()) {
            return p2.getName() + " wins";
        } else {
            return "It's a draw";
        }
    }

    public String addCards(int PlayerId, int amount) {
        Player p = playerList.get(PlayerId);
        p.setHand(deck.drawCards(amount));
        return p.getHand().toString();
    }

    public Player getPlayer(int id) {
        return playerList.get(id);
    }

    public String getValue(int playerId) {
        return String.valueOf(playerList.get(playerId).getHand().getTotalValue());
    }
}
