/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import containers.Deck;
import objects.Hand;
import objects.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tobias Mouer, Unfinished. Use blackbox testing instead
 */
public class GameHandlerTest {
    
    public GameHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of startGame method, of class GameHandler.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        GameHandler instance = new GameHandler();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBet method, of class GameHandler.
     */
    @Test
    public void testGetBet() {
        System.out.println("getBet");
        GameHandler instance = new GameHandler();
        double expResult = 0.0;
        double result = instance.getBet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBet method, of class GameHandler.
     */
    @Test
    public void testSetBet() throws Exception {
        System.out.println("setBet");
        String bet = "";
        GameHandler instance = new GameHandler();
        instance.setBet(bet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandSize method, of class GameHandler.
     */
    @Test
    public void testGetHandSize() {
        System.out.println("getHandSize");
        int id = 0;
        GameHandler instance = new GameHandler();
        int expResult = 0;
        int result = instance.getHandSize(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setupPlayer method, of class GameHandler.
     */
    @Test
    public void testSetupPlayer() throws Exception {
        System.out.println("setupPlayer");
        String name = "";
        GameHandler instance = new GameHandler();
        Player expResult = null;
        Player result = instance.setupPlayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCash method, of class GameHandler.
     */
    @Test
    public void testGetTotalCash() {
        System.out.println("getTotalCash");
        GameHandler instance = new GameHandler();
        double expResult = 0.0;
        double result = instance.getTotalCash();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setupDeck method, of class GameHandler.
     */
    @Test
    public void testSetupDeck() {
        System.out.println("setupDeck");
        GameHandler instance = new GameHandler();
        Deck expResult = null;
        Deck result = instance.setupDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCards method, of class GameHandler.
     */
    @Test
    public void testDrawCards_int_int() {
        System.out.println("drawCards");
        int id = 0;
        int amount = 0;
        GameHandler instance = new GameHandler();
        Hand expResult = null;
        Hand result = instance.drawCards(id, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCards method, of class GameHandler.
     */
    @Test
    public void testDrawCards_int() {
        System.out.println("drawCards");
        int id = 0;
        GameHandler instance = new GameHandler();
        Hand expResult = null;
        Hand result = instance.drawCards(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetHands method, of class GameHandler.
     */
    @Test
    public void testResetHands() {
        System.out.println("resetHands");
        GameHandler instance = new GameHandler();
        instance.resetHands();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateValue method, of class GameHandler.
     */
    @Test
    public void testCalculateValue() {
        System.out.println("calculateValue");
        int id = 0;
        GameHandler instance = new GameHandler();
        int expResult = 0;
        int result = instance.calculateValue(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareHands method, of class GameHandler.
     */
    @Test
    public void testCompareHands() {
        System.out.println("compareHands");
        GameHandler instance = new GameHandler();
        String expResult = "";
        String result = instance.compareHands();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doubleBet method, of class GameHandler.
     */
    @Test
    public void testDoubleBet() {
        System.out.println("doubleBet");
        GameHandler instance = new GameHandler();
        double expResult = 0.0;
        double result = instance.doubleBet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of surrender method, of class GameHandler.
     */
    @Test
    public void testSurrender() {
        System.out.println("surrender");
        GameHandler instance = new GameHandler();
        double expResult = 0.0;
        double result = instance.surrender();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class GameHandler.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        GameHandler instance = new GameHandler();
        Player expResult = null;
        Player result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class GameHandler.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        GameHandler instance = new GameHandler();
        Deck expResult = null;
        Deck result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDealerHand method, of class GameHandler.
     */
    @Test
    public void testGetDealerHand() {
        System.out.println("getDealerHand");
        GameHandler instance = new GameHandler();
        Hand expResult = null;
        Hand result = instance.getDealerHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerHand method, of class GameHandler.
     */
    @Test
    public void testGetPlayerHand() {
        System.out.println("getPlayerHand");
        GameHandler instance = new GameHandler();
        Hand expResult = null;
        Hand result = instance.getPlayerHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GameHandler.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GameHandler instance = new GameHandler();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
