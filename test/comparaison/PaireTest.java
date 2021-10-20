package comparaison;

import comparaison.Paire;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poker.Carte;
import comparaison.Paire;

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
    }

    @Test
    void isPaire() {
        assertEquals(p1.isPaire(),false,"La main 1 n'a pas de paire, donc OK !");
        assertEquals(p2.isPaire(),true,"La main 2 a une paire, donc OK !");
        assertEquals(p3.isPaire(),true,"La main 2 a une paire, donc OK !");
    }

    @Test
    void is2Paire(){
        assertEquals(p1.is2Paire(), false, "Il n'y a pas de deuxième paire dans la main 1");
        assertEquals(p2.is2Paire(), true, "Il y a une deuxième paire dans la main 2");
        assertEquals(p3.is2Paire(), false, "Il n'y a pas de deuxième paire dans la main 3");
    }

    @Test
    void getValeurMaxPaire(){
        assertEquals(p1.getValeurMaxPaire(), 0);
        assertEquals(p2.getValeurMaxPaire(), 8);
        assertEquals(p3.getValeurMaxPaire(), 11);
    }
}