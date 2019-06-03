/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version2.Handlers;

import com.mycompany.version2.Objects.Player;

/**
 *
 * @author Tobias Mouer
 */
public class GameHandler {
    public String CalculateHands(Player p1, Player p2){
        if(p1.getHand().getTotalValue() > 21){
            return p2.getName() +" wins";
        }
        if(p2.getHand().getTotalValue() > 21){
            return p1.getName() +" wins";
        }
        if(p1.getHand().getTotalValue()>p2.getHand().getTotalValue()){
            return p1.getName() +" wins";
        }
        if(p1.getHand().getTotalValue()<p2.getHand().getTotalValue()){
            return p2.getName() +" wins";
        } else {
            return "It's a draw";
        }
    }
}
