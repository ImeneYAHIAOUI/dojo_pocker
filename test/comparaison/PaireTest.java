package comparaison;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poker.Carte;

import java.util.ArrayList;

class PaireTest {
    ArrayList<Carte> cartes = new ArrayList<>();
    ArrayList<Carte> cartes2 = new ArrayList<>();
    ArrayList<Carte> cartes3 = new ArrayList<>();
    Paire p1;
    Paire p2;
    Paire p3;

    @BeforeEach
    void setUp() {
        cartes.add(new Carte("V"));
        cartes.add(new Carte("3"));
        cartes2.add(new Carte("4"));
        cartes2.add(new Carte("4"));
        cartes2.add(new Carte("8"));
        cartes2.add(new Carte("8"));
        cartes3.add(new Carte("V"));
        cartes3.add(new Carte("V"));

        p1 = new Paire(cartes);
        p2 = new Paire(cartes2);
        p3 = new Paire(cartes3);
        p1.isPaire();
        p2.isPaire();
        p3.isPaire();
        p1.is2Paire();
        p2.is2Paire();
        p3.is2Paire();
    }

    @Test
    void isPaire() {
        assertFalse(p1.isPaire(),"La main 1 n'a pas de paire, donc OK !");
        assertTrue(p2.isPaire(),"La main 2 a une paire, donc OK !");
        assertTrue(p3.isPaire(),"La main 2 a une paire, donc OK !");
    }

    @Test
    void is2Paire(){
        assertFalse(p1.is2Paire(), "Il n'y a pas de deuxième paire dans la main 1");
        assertTrue(p2.is2Paire(), "Il y a une deuxième paire dans la main 2");
        assertFalse(p3.is2Paire(), "Il n'y a pas de deuxième paire dans la main 3");
    }

    @Test
    void getValeurMaxPaire(){
        assertEquals(p1.getValeurMaxPaire(), 0);
        assertEquals(p2.getMaxPaire().getIntValue(), 8);
        assertEquals(p3.getMaxPaire().getIntValue(), 11);
    }







}