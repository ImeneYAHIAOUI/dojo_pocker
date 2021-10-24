package comparaison;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poker.Carte;
import poker.Hand;

import java.util.ArrayList;

class FullTest {

    Hand hand1;
    Hand hand2;
    Hand hand3;
    Hand hand4;
    Hand hand5;

    ArrayList<Carte> sortedCard1 = new ArrayList<>();
    ArrayList<Carte> sortedCard2 = new ArrayList<>();
    ArrayList<Carte> unsortedCard3 = new ArrayList<>();
    ArrayList<Carte> sortedCard4 = new ArrayList<>();
    ArrayList<Carte> sortedCard5 = new ArrayList<>();

    Full full1;
    Full full2;
    Full full3;
    Full full4;
    Full full5;

    @BeforeEach

    void setUp(){
        sortedCard1.add(new Carte("8"));
        sortedCard1.add(new Carte("8"));
        sortedCard1.add(new Carte("R"));
        sortedCard1.add(new Carte("R"));
        sortedCard1.add(new Carte("R"));
        hand1 = new Hand(sortedCard1);
        full1 = new Full(hand1);

        sortedCard2.add(new Carte("6"));
        sortedCard2.add(new Carte("V"));
        sortedCard2.add(new Carte("A"));
        sortedCard2.add(new Carte("A"));
        sortedCard2.add(new Carte("A"));
        hand2 = new Hand(sortedCard2);
        full2 = new Full(hand2);

        unsortedCard3.add(new Carte("8"));
        unsortedCard3.add(new Carte("3"));
        unsortedCard3.add(new Carte("8"));
        unsortedCard3.add(new Carte("3"));
        unsortedCard3.add(new Carte("8"));
        hand3 = new Hand(unsortedCard3);
        full3 = new Full(hand3);

        sortedCard4.add(new Carte("3"));
        sortedCard4.add(new Carte("4"));
        sortedCard4.add(new Carte("7"));
        sortedCard4.add(new Carte("8"));
        sortedCard4.add(new Carte("8"));
        hand4 = new Hand(sortedCard4);
        full4 = new Full(hand4);

        sortedCard5.add(new Carte("2"));
        sortedCard5.add(new Carte("5"));
        sortedCard5.add(new Carte("A"));
        sortedCard5.add(new Carte("2"));
        sortedCard5.add(new Carte("R"));
        hand5 = new Hand(sortedCard5);
        full5 = new Full(hand5);
    }

    @Test
    void isFull(){
        assertTrue(full1.isFull());
        assertFalse(full2.isFull());
        assertTrue(full3.isFull());
        assertFalse(full4.isFull());
        assertFalse(full5.isFull());
    }

    @Test
    void getHand(){
        assertEquals(full1.getHand(),hand1);
        assertEquals(full2.getHand(),hand2);
        assertEquals(full3.getHand(),hand3);
        assertEquals(full4.getHand(),hand4);
        assertEquals(full5.getHand(),hand5);

    }

    @Test
    void getBrelan(){
        assertNotNull(full1.getBrelan().getCarteBrelan());
        assertNotNull(full2.getBrelan().getCarteBrelan());
        assertNotNull(full3.getBrelan().getCarteBrelan());
        assertNull(full4.getBrelan().getCarteBrelan());
        assertNull(full5.getBrelan().getCarteBrelan());
    }



}
