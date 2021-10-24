package comparaison;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poker.Carte;


import java.util.ArrayList;
class SquareTest{
    ArrayList<Carte> sortedCard1 = new ArrayList<>();
    ArrayList<Carte> sortedCard2 = new ArrayList<>();
    ArrayList<Carte> unsortedCard3 = new ArrayList<>();
    ArrayList<Carte> sortedCard4 = new ArrayList<>();

    Square square1;
    Square square2;
    Square square3;
    Square square4;

    @BeforeEach
    void Setup(){
        sortedCard1.add(new Carte("R"));
        sortedCard1.add(new Carte("R"));
        sortedCard1.add(new Carte("R"));
        sortedCard1.add(new Carte("R"));
        sortedCard1.add(new Carte("A"));
        square1 = new Square(sortedCard1);

        sortedCard2.add(new Carte("3"));
        sortedCard2.add(new Carte("9"));
        sortedCard2.add(new Carte("9"));
        sortedCard2.add(new Carte("9"));
        sortedCard2.add(new Carte("9"));
        square2 = new Square(sortedCard2);

        unsortedCard3.add(new Carte("D"));
        unsortedCard3.add(new Carte("A"));
        unsortedCard3.add(new Carte("D"));
        unsortedCard3.add(new Carte("D"));
        unsortedCard3.add(new Carte("D"));
        square3 = new Square(unsortedCard3);

        sortedCard4.add(new Carte("4"));
        sortedCard4.add(new Carte("4"));
        sortedCard4.add(new Carte("4"));
        sortedCard4.add(new Carte("5"));
        sortedCard4.add(new Carte("9"));
        square4 = new Square(sortedCard4);

    }

    @Test
    void isSquare(){
        assertTrue(square1.isSquare());
        assertTrue(square2.isSquare());
        assertFalse(square3.isSquare());
        assertFalse(square4.isSquare());
    }
    @Test
    void getSquareCard(){
        assertNotNull(square1.getSquareCard());
        assertNotNull(square2.getSquareCard());

        assertNull(square3.getSquareCard());
        assertNull(square4.getSquareCard());
    }

}


