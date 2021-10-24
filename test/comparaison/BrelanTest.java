package comparaison;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poker.Carte;


import java.util.ArrayList;

class BrelanTest {

    ArrayList<Carte> sortedCard1 = new ArrayList<>();
    ArrayList<Carte> sortedCard2 = new ArrayList<>();
    ArrayList<Carte> unsortedCard3 = new ArrayList<>();

    Brelan brelan1;
    Brelan brelan2;
    Brelan brelan3;

    @BeforeEach
    void setUp() {
        sortedCard1.add(new Carte("3"));
        sortedCard1.add(new Carte("3"));
        sortedCard1.add(new Carte("3"));
        sortedCard1.add(new Carte("7"));
        sortedCard1.add(new Carte("R"));
        brelan1 = new Brelan(sortedCard1);

        sortedCard2.add(new Carte("5"));
        sortedCard2.add(new Carte("6"));
        sortedCard2.add(new Carte("9"));
        sortedCard2.add(new Carte("V"));
        sortedCard2.add(new Carte("R"));
        brelan2 = new Brelan(sortedCard2);

        unsortedCard3.add(new Carte("7"));
        unsortedCard3.add(new Carte("3"));
        unsortedCard3.add(new Carte("7"));
        unsortedCard3.add(new Carte("7"));
        unsortedCard3.add(new Carte("2"));

        brelan3 = new Brelan(unsortedCard3);
    }

    @Test
    void isBrelan(){

        assertTrue(brelan1.isBrelan());
        assertFalse(brelan2.isBrelan());
        assertFalse(brelan3.isBrelan());

    }

    @Test
    void getCarteBrelan(){

        assertNotNull(brelan1.getCarteBrelan());
        assertNull(brelan2.getCarteBrelan());
        assertNull(brelan3.getCarteBrelan());


    }



}
