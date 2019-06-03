/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import containers.Deck;
import handlers.GameHandler;
import java.util.Scanner;
import objects.Player;

/**
 *
 * @author Tobias Mouer
 */
public class Main {

    static GameHandler gh;
    static Scanner user_input;

    /**
     * Starts the command prompt
     */
    public static void main(String[] args) {
        gh = new GameHandler();
        String first_name;
        user_input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        first_name = user_input.next();
        try {
            gh.setupPlayer(first_name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Main.main(args);
        }
        gh.startGame();
        gameLoop();
    }

    /**
     *  Runs the game until you run out of cash 
     *  or decides to go on with your life
     */
    public static void gameLoop() {
        while (true) {
            System.out.println("You have: " + gh.getTotalCash() + " $");
            System.out.print("Enter how many chips you want to bet: ");
            String amount = user_input.next();
            try {
                gh.setBet(amount);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                gameLoop();
                break;
            }
            System.out.println("You have betted " + amount + " $");

            System.out.println("Dealer has: " + gh.getDealerHand() + " = " + gh.calculateValue(0) + " points");
            System.out.println("You have: " + gh.getPlayerHand() + " = " + gh.calculateValue(1) + " points");
            try {
                if (gh.containsPair()) {
                    System.out.println("Do you want to do a split? (y/n)");
                    String answer = user_input.next();
                    if (answer.equals("y")) {
                        System.out.println("Too bad, it isn't implemented yet");
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
            while (true && gh.calculateValue(1) < 21) {
                System.out.println("Do you want to hit? (y/n)");
                String ans = user_input.next();
                if ("y".equals(ans)) {
                    System.out.println(gh.drawCards(1) + " = " + gh.calculateValue(1) + " points");
                } else {
                    break;
                }
            }
            if (gh.calculateValue(1) == 21 && gh.getHandSize(1) == 2) {
                System.out.println("The dealer now have: " + gh.drawCards(0, 1) + " = " + gh.calculateValue(0) + " points");
                System.out.println(gh.compareHands());
            } else {
                System.out.println("The dealer now have: " + gh.drawCards(0, 1) + " = " + gh.calculateValue(0) + " points");
                if (gh.calculateValue(1) > 21) {
                    System.out.println(gh.compareHands());
                } else {
                    while (gh.calculateValue(0) < gh.calculateValue(1)) {
                        System.out.println("The dealer now have: " + gh.drawCards(0, 1) + " = " + gh.calculateValue(0) + " points");
                    }
                    System.out.println(gh.compareHands());

                }
            }
            System.out.println("Your new balance is " + gh.getTotalCash() + " $");
            if (gh.getTotalCash() == 0) {
                System.out.println("Sorry, no more cash. Thanks for playing. The door is to the left.");
                break;
            }
            System.out.println("Do you want to try again? (y/n)");
            String answer = user_input.next();
            if (answer.equals("n")) {
                break;
            }
            if (answer.equals("y")) {
                gh.resetHands();
            } else {
                break;
            }
        }
    }

// Test
//        GameHandler gh = new GameHandler();
//        gh.setupPlayer("Tobias");
//        gh.startGame();
//        System.out.println(gh);
//        gh.drawCards(1, 1);
//        gh.drawCards(0, 1);
//        System.out.println(gh);
//        System.out.println(gh.calculateValue(0));
//        System.out.println(gh.calculateValue(1));
//        System.out.println(gh.compareHands());
}
