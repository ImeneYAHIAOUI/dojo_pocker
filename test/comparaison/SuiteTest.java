package comparaison;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poker.*;


import java.util.ArrayList;

class SuiteTest {
    ArrayList<Carte> card1 = new ArrayList<>();
    ArrayList<Carte> card2 = new ArrayList<>();
    ArrayList<Carte> card3 = new ArrayList<>();
    ArrayList<Carte> card4 = new ArrayList<>();

    Hand hand1;
    Hand hand2;
    Hand hand3;
    Hand hand4;

    Suite suite1;
    Suite suite2;
    Suite suite3;
    Suite suite4;

    @BeforeEach
    void setUp(){
        card1.add(new Carte("2"));
        card1.add(new Carte("3"));
        card1.add(new Carte("4"));
        card1.add(new Carte("5"));
        card1.add(new Carte("6"));
        hand1 = new Hand(card1);
        suite1 = new Suite(hand1);

        card2.add(new Carte("10"));
        card2.add(new Carte("V"));
        card2.add(new Carte("D"));
        card2.add(new Carte("R"));
        card2.add(new Carte("A"));
        hand2 = new Hand(card2);
        suite2 = new Suite(hand2);

        card3.add(new Carte("3"));
        card3.add(new Carte("4"));
        card3.add(new Carte("6"));
        card3.add(new Carte("7"));
        card3.add(new Carte("8"));
        hand3 = new Hand(card3);
        suite3 = new Suite(hand3);

        card4.add(new Carte("4"));
        card4.add(new Carte("7"));
        card4.add(new Carte("3"));
        card4.add(new Carte("R"));
        card4.add(new Carte("8"));
        hand4 = new Hand(card4);
        suite4 = new Suite(hand4);
    }

    @Test
    void isSuite(){
        assertTrue(suite1.isSuite());
        assertTrue(suite2.isSuite());

        assertFalse(suite3.isSuite());
        assertFalse(suite4.isSuite());
    }

    @Test
    void getHand(){
        assertEquals(suite1.getHand(),hand1);
        assertEquals(suite2.getHand(),hand2);
        assertEquals(suite3.getHand(),hand3);
        assertEquals(suite4.getHand(),hand4);
    }
}
