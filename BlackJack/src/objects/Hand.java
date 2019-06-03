/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import containers.Deck;
import java.util.ArrayList;
import objects.Card;

/**
 *
 * @author Tobias Mouer
 */
public class Hand {

    private int playerid;
    private ArrayList<Card> cards;
    private int totalValue;
    private double bet;

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand() {
        cards = new ArrayList<>();
    }

    public int getPlayerId() {
        return playerid;
    }

    public void setPlayerId(int id) {
        this.playerid = id;
    }

    public ArrayList<Card> addCards(Deck d, int amount) {
        ArrayList<Card> list = d.draw(amount);
        list.forEach((c) -> {
            cards.add(c);
        });
        return list;
    }

    public boolean containsPair() throws Exception {
        if (cards.size() != 2) {
            throw new Exception("You cannot do this");
        }
        return cards.get(0).equals(cards.get(1));
    }

    public int calculateHand() {
        int value = 0;
        for (Card c : cards) {
            int id = c.getId();
            if (id <= 10) {
                value = value + id;
            }
            if (id > 10) {
                value = value + 10;
            }
        }
        if (value <= 11 && containsAce()) {
            value = value + 10;
        }
        return value;
    }

    public boolean containsAce() {
        for (Card c : cards) {
            if (c.getId() == 1) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

}
