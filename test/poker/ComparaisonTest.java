package poker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import comparaison.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComparaisonTest {
    private Comparaison comparaison1;
    private Comparaison comparaison2;
    private Brelan brelan1;
    private Brelan brelan2;
    private Full full1;
    private Full full2;
    private Suite suite1;
    private Suite suite2;
    private Paire paire1;
    private Paire paire2;
    private Paire paire3;
    private Paire Dpaire4_5;
    private Paire Dpaire5_6;
    private Square carre1;
    private Square carre2;
    private Comparaison comparaison3;

    ArrayList<Carte> mainJoueurTest = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest2 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest3 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest4 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest5 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest6 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest7 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest8 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest9 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest10 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest11 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest12 = new ArrayList<>();


    private Carte winningCard;
    private Carte losingCard;
    private Carte equalsCard;


    @BeforeEach
    void setUp() {

        //les nombre pair gagnent !

        //brelan 1
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("6"));
        mainJoueurTest.add(new Carte("7"));
        Hand hand1 = new Hand(mainJoueurTest);
        brelan1=new Brelan(hand1.getSortedCard());

        //brelan 2
        mainJoueurTest2.add(new Carte("8"));
        mainJoueurTest2.add(new Carte("8"));
        mainJoueurTest2.add(new Carte("8"));
        mainJoueurTest2.add(new Carte("6"));
        mainJoueurTest2.add(new Carte("7"));
        Hand hand2 = new Hand(mainJoueurTest2);
        brelan2=new Brelan(hand2.getSortedCard());


        //full 1
        mainJoueurTest3.add(new Carte("5"));
        mainJoueurTest3.add(new Carte("5"));
        mainJoueurTest3.add(new Carte("6"));
        mainJoueurTest3.add(new Carte("6"));
        mainJoueurTest3.add(new Carte("6"));
        Hand hand3 = new Hand(mainJoueurTest3);
        full1=new Full(hand3);

        //full 2
        mainJoueurTest4.add(new Carte("5"));
        mainJoueurTest4.add(new Carte("5"));
        mainJoueurTest4.add(new Carte("7"));
        mainJoueurTest4.add(new Carte("7"));
        mainJoueurTest4.add(new Carte("7"));
        Hand hand4 = new Hand(mainJoueurTest4);
        full2=new Full(hand4);

        //suite1
        mainJoueurTest5.add(new Carte("3"));
        mainJoueurTest5.add(new Carte("4"));
        mainJoueurTest5.add(new Carte("5"));
        mainJoueurTest5.add(new Carte("6"));
        mainJoueurTest5.add(new Carte("7"));
        Hand hand5 = new Hand(mainJoueurTest5);
        suite1=new Suite(hand5);

        //suite2
        mainJoueurTest6.add(new Carte("4"));
        mainJoueurTest6.add(new Carte("5"));
        mainJoueurTest6.add(new Carte("6"));
        mainJoueurTest6.add(new Carte("7"));
        mainJoueurTest6.add(new Carte("8"));
        Hand hand6 = new Hand(mainJoueurTest6);
        suite2=new Suite(hand6);

        //paire1
        mainJoueurTest7.add(new Carte("5"));
        mainJoueurTest7.add(new Carte("4"));
        mainJoueurTest7.add(new Carte("5"));
        mainJoueurTest7.add(new Carte("6"));
        mainJoueurTest7.add(new Carte("7"));

        Hand hand7 = new Hand(mainJoueurTest7);
        paire1=new Paire(hand7.getSortedCard());

        //paire2
        mainJoueurTest8.add(new Carte("5"));
        mainJoueurTest8.add(new Carte("4"));
        mainJoueurTest8.add(new Carte("6"));
        mainJoueurTest8.add(new Carte("6"));
        mainJoueurTest8.add(new Carte("7"));
        Hand hand8 = new Hand(mainJoueurTest8);
        paire2=new Paire(hand8.getSortedCard());

        mainJoueurTest9.add(new Carte("5"));
        mainJoueurTest9.add(new Carte("4"));
        mainJoueurTest9.add(new Carte("5"));
        mainJoueurTest9.add(new Carte("4"));
        mainJoueurTest9.add(new Carte("7"));
        Hand hand9 = new Hand(mainJoueurTest9);
        Dpaire4_5=new Paire(hand9.getSortedCard());

        mainJoueurTest10.add(new Carte("5"));
        mainJoueurTest10.add(new Carte("6"));
        mainJoueurTest10.add(new Carte("5"));
        mainJoueurTest10.add(new Carte("6"));
        mainJoueurTest10.add(new Carte("7"));
        Hand hand10 = new Hand(mainJoueurTest10);
        Dpaire5_6=new Paire(hand10.getSortedCard());

        mainJoueurTest11.add(new Carte("5"));
        mainJoueurTest11.add(new Carte("5"));
        mainJoueurTest11.add(new Carte("5"));
        mainJoueurTest11.add(new Carte("5"));
        mainJoueurTest11.add(new Carte("7"));
        Hand hand11 = new Hand(mainJoueurTest11);
        carre1=new Square(hand11.getSortedCard());

        mainJoueurTest12.add(new Carte("6"));
        mainJoueurTest12.add(new Carte("6"));
        mainJoueurTest12.add(new Carte("6"));
        mainJoueurTest12.add(new Carte("6"));
        mainJoueurTest12.add(new Carte("7"));

        Hand hand12 = new Hand(mainJoueurTest12);
        carre2=new Square(hand12.getSortedCard());

        comparaison1=new Comparaison(hand3, hand4);
        comparaison2=new Comparaison(hand4, hand6);
        comparaison3=new Comparaison(hand7, hand8);
        winningCard=new Carte("5");
        losingCard=new Carte("3");
        equalsCard=new Carte("5");

        comparaison3.winnerSetter();
        comparaison2.winnerSetter();
        comparaison1.winnerSetter();
        //ordre : brelan , full ,suite,pair;
        //=new Hand();
        //hand3=new Hand();
        //full1=new Full(Hand());
        //paire1=new Paire(new Carte("3"),new Carte("4"),new Carte("5"),new Carte("2"),new Carte("3"));
    }

    @Test
    void comparaison_valeur_haute() {

        assertEquals(comparaison1.comparaison_valeur_haute(winningCard,losingCard),winningCard);
        assertEquals(comparaison1.comparaison_valeur_haute(losingCard,winningCard),winningCard);
        assertNull(comparaison1.comparaison_valeur_haute(winningCard, equalsCard));

    }

    @Test
    void compareisonFull() {
        assertEquals(comparaison1.comparaisonFull(full1,full2).getIntValue(),7);
        assertEquals(comparaison1.comparaisonFull(full2,full1).getIntValue(),7);
        assertNull(comparaison1.comparaisonFull(full2, full2));
    }

    @Test
    void comparaisonSuite() {
        assertEquals(comparaison1.comparaisonSuite(suite1,suite2).getIntValue(),8);
        assertEquals(comparaison1.comparaisonSuite(suite2,suite1).getIntValue(),8);
        assertNull(comparaison1.comparaisonSuite(suite1, suite1));
    }

    @Test
    void comparaisonBrelans() {
        assertEquals(comparaison1.comparaisonBrelans(brelan1,brelan2).getIntValue(),8);
        assertEquals(comparaison1.comparaisonBrelans(brelan2,brelan1).getIntValue(),8);
        assertNull(comparaison1.comparaisonBrelans(brelan2, brelan2));
    }

    @Test
    void comparaison2Paires() {

        assertEquals(comparaison1.comparaison2Paires(Dpaire4_5,Dpaire5_6).getIntValue(),6);
        assertEquals(comparaison1.comparaison2Paires(Dpaire5_6,Dpaire4_5).getIntValue(),6);
        assertNull(comparaison1.comparaison2Paires(Dpaire5_6, Dpaire5_6));
    }
    @Test
    void comparaisonSquare() {
        assertEquals(comparaison1.comparaisonSquare(carre1,carre2).getIntValue(),6);
        assertEquals(comparaison1.comparaisonSquare(carre2,carre1).getIntValue(),6);
        assertNull(comparaison1.comparaisonSquare(carre1, carre1));
    }
    @Test
    void comparaisonPaires() {
        assertEquals(comparaison1.comparaisonPaires(paire1,paire2).getIntValue(),6);
        assertEquals(comparaison1.comparaisonPaires(paire2,paire1).getIntValue(),6);

    }
    //inutile car la modification de winningCard et de methodeComparaison sont implicitement
    //testé dans les test suivant
    //@Test
    //void winnerSetter() {
    //faire un test pour chaque type et pour quand les type sont different
    //assertEquals(comparaison1.winnerSetter().,);
    //}

    @Test
    void getWinningCard() {


        assertEquals(comparaison1.getWinningCard().getIntValue(),new Carte("7").getIntValue());
        assertNull(comparaison2.getWinningCard());
    }

    @Test
    void getMethodeComparaison() {
        assertEquals(comparaison1.getMethodeComparaison(),"full");
        assertEquals(comparaison3.getMethodeComparaison(),"paire");
        assertEquals(comparaison2.getMethodeComparaison(),"full");
    }
}