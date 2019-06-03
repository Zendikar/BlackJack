/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Tobias Mouer
 */
public class Player {
    private int id;
    private String Name;
    private double totalCash;

    public Player(String Name) {
        this.Name = Name;
        this.totalCash = 100;
    }

    public Player(String Name, double totalCash) {
        this.Name = Name;
        this.totalCash = totalCash;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    @Override
    public String toString() {
        return "Player{" + "Name=" + Name + ", totalCash=" + totalCash + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
