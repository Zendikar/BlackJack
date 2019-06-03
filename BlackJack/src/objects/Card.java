/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Objects;

/**
 * 
 * @author Tobias Mouer
 */
public class Card {

    private int id;
    private String type;

    public String getType() {
        return type;
    }

    public Card() {
    }

    public Card(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return Objects.equals(this.id, other.id);
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
}
