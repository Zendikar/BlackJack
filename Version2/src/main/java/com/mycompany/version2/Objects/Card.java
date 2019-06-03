/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.version2.Objects;

/**
 *
 * @author Tobias Mouer
 */
public class Card {
    private int id;
    private String type;

    public Card(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        switch (id) {
            case 1:
                return "Ace of " + type;
            case 11:
                return "Jack of " + type;
            case 12:
                return "Queen of " + type;
            case 13:
                return "King of " + type;
            default:
                return id + " of " + type;
        }
    }

    public int getValue() {
        switch (id) {
            case 11:
                return 10;
            case 12:
                return 10;
            case 13:
                return 10;
            default:
                return id;
        }
    }    
}
