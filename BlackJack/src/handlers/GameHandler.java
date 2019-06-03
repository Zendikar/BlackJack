/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import objects.Hand;
import containers.*;
import objects.*;

/**
 *
 * @author Tobias Mouer
 */
public class GameHandler {

    private Player player;
    private Player dealer;
    private Deck deck;
    private PlayerList players;
    private HandList hands;
    private double bet;

    private Hand dealerHand;
    private Hand playerHand;

    public GameHandler() {
        deck = new Deck();
        dealer = new Player("Dealer");
        players = new PlayerList();
        hands = new HandList();
        dealerHand = hands.addHand(new Hand(), hands.size());
        playerHand = hands.addHand(new Hand(), hands.size());
    }

    public void startGame() {
        drawCards(0, 1);
        drawCards(1, 2);
    }

    public double getBet() {
        return bet;
    }

    public void setBet(String bet) throws Exception {
        double cash = 0;
        try {
            try {
                cash = Double.parseDouble(bet);
            } catch (Exception e) {
                throw new Exception("Please type numbers only");
            }
            if (cash != 0) {
                if (cash <= player.getTotalCash()) {
                    this.bet = cash;
                } else {
                    throw new Exception("You don't have enough cash");
                }
            } else {
                throw new Exception("You can't bet nothing");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public int getHandSize(int id) {
        if (id == 0) {
            return dealerHand.getCards().size();
        } else {
            return playerHand.getCards().size();
        }
    }

    public boolean containsPair() throws Exception {
        if (playerHand.containsPair()) {
            return true;
        } else {
            return false;
        }
    }

    public Player setupPlayer(String name) throws Exception {
        if (!"dealer".equals(name.trim().toLowerCase())) {
            player = new Player(name);
        } else {
            throw new Exception("Your name cannot be dealer");
        }
        return player;
    }

    public double getTotalCash() {
        return player.getTotalCash();
    }

    public Deck setupDeck() {
        deck = new Deck();
        return deck;
    }

    // zero is dealer
    public Hand drawCards(int id, int amount) {
        if (!deck.checkIfEmpty()) {
            if (id == 0) {
                dealerHand.addCards(deck, amount);
                return dealerHand;
            } else {
                playerHand.addCards(deck, amount);
                return playerHand;
            }
        } else {
            deck.addDeck();
            return drawCards(id, amount);
        }
    }

    public Hand drawCards(int id) {
        return drawCards(id, 1);
    }

    public void resetHands() {
        dealerHand = new Hand();
        playerHand = new Hand();
        drawCards(0);
        drawCards(1, 2);
    }

    public int calculateValue(int id) {
        if (id == 0) {
            return dealerHand.calculateHand();
        } else {
            return playerHand.calculateHand();
        }
    }

    public String compareHands() {
        int player1 = calculateValue(1);
        int dealer = calculateValue(0);
        if (player1 > 21) {
            player.setTotalCash(player.getTotalCash() - bet);
            return "dealer wins";
        }
        if (dealer > 21) {
            player.setTotalCash(player.getTotalCash() + bet);
            return player.getName() + " wins";
        }
        if (player1 > dealer) {
            player.setTotalCash(player.getTotalCash() + bet);
            return player.getName() + " wins";
        }
        if (player1 == dealer) {
            return "It's a draw";
        } else {
            player.setTotalCash(player.getTotalCash() - bet);
            return "The dealer wins";
        }
    }

    public double doubleBet() {
        bet = bet + bet;
        return bet;
    }

    public double surrender() {
        bet = bet / 2;
        return bet;
    }

    public Player getPlayer() {
        return player;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getDealerHand() {
        return dealerHand;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    @Override
    public String toString() {
        return "GameHandler{" + player + "\n deck=" + deck + "\n dealerHand=" + dealerHand + "\n playerHand=" + playerHand + '}';
    }
}
