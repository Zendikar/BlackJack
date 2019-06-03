/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import objects.Hand;
import java.util.ArrayList;
import objects.Player;

/**
 * @author Tobias Mouer, Experimental and unfinished
 */
public class PlayerList extends ArrayList {

    private ArrayList<Player> players;

    public PlayerList() {
        players = new ArrayList<>();
    }

    public Player addPlayer(Player p) {
        players.add(p);
        return p;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

}
