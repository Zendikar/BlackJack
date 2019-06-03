/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import objects.Hand;

/**
 *
 * @author Tobias Mouer, Experimental and unfinished
 */
public class HandList extends ArrayList {

    private ArrayList<Hand> hands;

    public HandList() {
        hands = new ArrayList<>();
    }

    public HandList(ArrayList<Hand> hands) {
        this.hands = hands;
    }

    public Hand addHand(Hand h, int playerId) {
        h.setPlayerId(playerId);
        hands.add(h);
        return h;
    }

    public ArrayList<Hand> getListofHands(int playerId) {
        ArrayList<Hand> al = new ArrayList<>();
        for (Hand h : hands) {
            if (h.getPlayerId() == playerId) {
                al.add(h);
            }
        }
        return al;
    }

    public ArrayList<Hand> getHands() {
        return hands;
    }

    public void setHands(ArrayList<Hand> hands) {
        this.hands = hands;
    }
}
