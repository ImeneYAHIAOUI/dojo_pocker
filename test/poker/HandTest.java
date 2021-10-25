package poker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {
    ArrayList<Carte> mainJoueurTest = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest2 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest3 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest4 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest5 = new ArrayList<>();
    private Hand hand1;
    private Hand hand2;
    private Hand hand3;
    private Hand hand4;
    private Hand hand5;
    @BeforeEach
    void setUp(){
        mainJoueurTest.add(new Carte("2"));
        mainJoueurTest.add(new Carte("3"));
        mainJoueurTest.add(new Carte("6"));
        mainJoueurTest.add(new Carte("7"));
        mainJoueurTest.add(new Carte("8"));
        hand1=new Hand(mainJoueurTest);

        mainJoueurTest2.add(new Carte("8"));
        mainJoueurTest2.add(new Carte("2"));
        mainJoueurTest2.add(new Carte("3"));
        mainJoueurTest2.add(new Carte("6"));
        mainJoueurTest2.add(new Carte("7"));
        hand2=new Hand(mainJoueurTest2);

        mainJoueurTest3.add(new Carte("5"));
        mainJoueurTest3.add(new Carte("5"));
        mainJoueurTest3.add(new Carte("6"));
        mainJoueurTest3.add(new Carte("6"));
        mainJoueurTest3.add(new Carte("9"));
        hand3=new Hand(mainJoueurTest3);

        mainJoueurTest4.add(new Carte("5"));
        mainJoueurTest4.add(new Carte("6"));
        mainJoueurTest4.add(new Carte("7"));
        mainJoueurTest4.add(new Carte("8"));
        mainJoueurTest4.add(new Carte("9"));
        hand4=new Hand(mainJoueurTest4);

        mainJoueurTest5.add(new Carte("5"));
        mainJoueurTest5.add(new Carte("5"));
        mainJoueurTest5.add(new Carte("5"));
        mainJoueurTest5.add(new Carte("5"));
        mainJoueurTest5.add(new Carte("5"));
        hand5=new Hand(mainJoueurTest5);

    }
    @Test
    void getCartes(){
        assertEquals(mainJoueurTest,hand1.getCartes());

    }

    @Test
    void getMaxCarte(){
        assertEquals(9,hand3.getMaxCarte().getIntValue());
    }
    @Test
    void isConsecutive(){
        assertTrue(hand4.isConsecutive());
        assertFalse(hand5.isConsecutive());
    }
    @Test
    void SameValueCards(){
        assertTrue(hand5.SameValueCards());
        assertFalse(hand4.SameValueCards());
    }
}
