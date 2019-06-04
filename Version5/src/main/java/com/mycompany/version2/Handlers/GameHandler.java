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
    
    private final DeckOfCards deck;
    private final ArrayList<Player> playerList;
    
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
    
    public String calculateHands(Player p1, Player p2) {
        if (p1.getHandValue() > 21) {
            return p2.getName() + " wins";
        }
        if (p2.getHandValue() > 21) {
            return p1.getName() + " wins";
        }
        if (p1.getHandValue() > p2.getHandValue()) {
            return p1.getName() + " wins";
        }
        if (p1.getHandValue() < p2.getHandValue()) {
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

    public Player addPlayer(String name, double coins) {
        playerList.add(new Player(name, coins));
        return playerList.get(playerList.size() + 1);
    }
    
    public Player getPlayer(int id) {
        return playerList.get(id);
    }
    
    public HandOfCards getPlayerHand(int id) {
        return playerList.get(id).getHand();
    }
    
    public String getValue(int playerId) {
        return String.valueOf(playerList.get(playerId).getHandValue());
    }
    
    public void startDealerTurn() {
        while (playerList.get(0).getHandValue() < 17) {
            addCards(0, 1);
        }
    }
//    public void reset(){
//        
//    }
}
