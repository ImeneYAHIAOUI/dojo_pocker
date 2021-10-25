package utils;

import poker.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class DisplayWinnerTest {
    ArrayList<Carte> card1 = new ArrayList<>();
    ArrayList<Carte> card2 = new ArrayList<>();
    ArrayList<Carte> card3 = new ArrayList<>();
    ArrayList<Carte> card4 = new ArrayList<>();
    ArrayList<Carte> card5 = new ArrayList<>();
    ArrayList<Carte> card6 = new ArrayList<>();
    ArrayList<Carte> card7 = new ArrayList<>();
    ArrayList<Carte> card8 = new ArrayList<>();
    ArrayList<Carte> card9 = new ArrayList<>();
    ArrayList<Carte> card10 = new ArrayList<>();
    ArrayList<Carte> card11 = new ArrayList<>();
    ArrayList<Carte> card12 = new ArrayList<>();
    ArrayList<Carte> card13 = new ArrayList<>();


    Hand hand1;
    Hand hand2;
    Hand hand3;
    Hand hand4;
    Hand hand5;
    Hand hand6;
    Hand hand7;
    Hand hand8;
    Hand hand9;
    Hand hand10;
    Hand hand11;
    Hand hand12;
    Hand hand13;


    Comparaison comparaison1;
    Comparaison comparaison2;
    Comparaison comparaison3;
    Comparaison comparaison4;
    Comparaison comparaison5;
    Comparaison comparaison6;
    Comparaison comparaison7;
    Comparaison comparaison8;
    Comparaison comparaison9;
    Comparaison comparaison10;
    Comparaison comparaison11;
    Comparaison comparaison12;
    Comparaison comparaison13;

    DisplayWinner displayWinner1;
    DisplayWinner displayWinner2;
    DisplayWinner displayWinner3;
    DisplayWinner displayWinner4;
    DisplayWinner displayWinner5;
    DisplayWinner displayWinner6;
    DisplayWinner displayWinner7;
    DisplayWinner displayWinner8;
    DisplayWinner displayWinner9;
    DisplayWinner displayWinner10;
    DisplayWinner displayWinner11;
    DisplayWinner displayWinner12;
    DisplayWinner displayWinner13;





    @BeforeEach
    void setUp(){
        //brelan
        card1.add(new Carte("3"));
        card1.add(new Carte("3"));
        card1.add(new Carte("3"));
        card1.add(new Carte("7"));
        card1.add(new Carte("R"));
        hand1 = new Hand(card1);
        //brelan
        card2.add(new Carte("2"));
        card2.add(new Carte("R"));
        card2.add(new Carte("8"));
        card2.add(new Carte("R"));
        card2.add(new Carte("R"));
        hand2 = new Hand(card2);
        //full
        card3.add(new Carte("4"));
        card3.add(new Carte("4"));
        card3.add(new Carte("A"));
        card3.add(new Carte("4"));
        card3.add(new Carte("A"));
        hand3 = new Hand(card3);
        //full
        card4.add(new Carte("6"));
        card4.add(new Carte("6"));
        card4.add(new Carte("2"));
        card4.add(new Carte("2"));
        card4.add(new Carte("2"));
        hand4 = new Hand(card4);
        //suite
        card5.add(new Carte("2"));
        card5.add(new Carte("3"));
        card5.add(new Carte("4"));
        card5.add(new Carte("5"));
        card5.add(new Carte("6"));
        hand5 = new Hand(card5);
        //suite
        card6.add(new Carte("10"));
        card6.add(new Carte("V"));
        card6.add(new Carte("D"));
        card6.add(new Carte("R"));
        card6.add(new Carte("A"));
        hand6 = new Hand(card6);
        //2paire
        card7.add(new Carte("R"));
        card7.add(new Carte("V"));
        card7.add(new Carte("V"));
        card7.add(new Carte("A"));
        card7.add(new Carte("A"));
        hand7 = new Hand(card7);
        //2paire
        card8.add(new Carte("5"));
        card8.add(new Carte("6"));
        card8.add(new Carte("5"));
        card8.add(new Carte("D"));
        card8.add(new Carte("6"));
        hand8 = new Hand(card8);
        //paire
        card9.add(new Carte("5"));
        card9.add(new Carte("3"));
        card9.add(new Carte("2"));
        card9.add(new Carte("3"));
        card9.add(new Carte("4"));
        hand9 = new Hand(card9);
        //paire
        card10.add(new Carte("D"));
        card10.add(new Carte("7"));
        card10.add(new Carte("4"));
        card10.add(new Carte("10"));
        card10.add(new Carte("D"));
        hand10 = new Hand(card10);
        //carre
        card11.add(new Carte("7"));
        card11.add(new Carte("9"));
        card11.add(new Carte("7"));
        card11.add(new Carte("7"));
        card11.add(new Carte("7"));
        hand11 = new Hand(card11);
        //carre
        card12.add(new Carte("10"));
        card12.add(new Carte("10"));
        card12.add(new Carte("10"));
        card12.add(new Carte("10"));
        card12.add(new Carte("A"));
        hand12 = new Hand(card12);
        //valeur_plus_haute
        card13.add(new Carte("8"));
        card13.add(new Carte("V"));
        card13.add(new Carte("6"));
        card13.add(new Carte("2"));
        card13.add(new Carte("R"));
        hand13 = new Hand(card13);

        comparaison1 = new Comparaison(hand1,hand2);
        comparaison2 = new Comparaison(hand1,hand13);
        comparaison3 = new Comparaison(hand3,hand4);
        comparaison4 = new Comparaison(hand3,hand13);
        comparaison5 = new Comparaison(hand5,hand6);
        comparaison6 = new Comparaison(hand5,hand13);
        comparaison7 = new Comparaison(hand7,hand8);
        comparaison8 = new Comparaison(hand8,hand13);
        comparaison9 = new Comparaison(hand9,hand10);
        comparaison10 = new Comparaison(hand10,hand11);
        comparaison11 = new Comparaison(hand10,hand13);
        comparaison12 = new Comparaison(hand11,hand12);
        comparaison13 = new Comparaison(hand11,hand13);



        displayWinner1 = new DisplayWinner(comparaison1);
        displayWinner2 = new DisplayWinner(comparaison2);
        displayWinner3 = new DisplayWinner(comparaison3);
        displayWinner4 = new DisplayWinner(comparaison4);
        displayWinner5 = new DisplayWinner(comparaison5);
        displayWinner6 = new DisplayWinner(comparaison6);
        displayWinner7 = new DisplayWinner(comparaison7);
        displayWinner8 = new DisplayWinner(comparaison8);
        displayWinner9 = new DisplayWinner(comparaison9);
        displayWinner10 = new DisplayWinner(comparaison10);
        displayWinner11 = new DisplayWinner(comparaison11);
        displayWinner12 = new DisplayWinner(comparaison12);
        displayWinner13 = new DisplayWinner(comparaison13);
    }

    @Test
     void TestToString(){
        assertEquals(displayWinner1.toString(),"C'est la "+ comparaison1 + " qui gagne avec "+comparaison1.getMethodeComparaison()+" : "+comparaison1.getWinningCard());
        assertEquals(displayWinner2.toString(),"C'est la "+ comparaison2 + " qui gagne avec "+comparaison2.getMethodeComparaison()+" : "+comparaison2.getWinningCard());
        assertEquals(displayWinner3.toString(),"C'est la "+ comparaison3 + " qui gagne avec "+comparaison3.getMethodeComparaison()+" : "+comparaison3.getWinningCard());
        assertEquals(displayWinner4.toString(),"C'est la "+ comparaison4 + " qui gagne avec "+comparaison4.getMethodeComparaison()+" : "+comparaison4.getWinningCard());

        assertEquals(displayWinner5.toString(),"C'est la "+ comparaison5 + " qui gagne car c'est la main "+comparaison5.getMethodeComparaison()+" la plus puissante grace à la carte : "+comparaison5.getWinningCard());
        assertEquals(displayWinner6.toString(),"C'est la "+ comparaison6 + " qui gagne car c'est une main "+comparaison6.getMethodeComparaison());

        assertEquals(displayWinner7.toString(),"C'est la "+ comparaison7 + " qui gagne avec "+comparaison7.getMethodeComparaison()+" : "+comparaison7.getWinningCard());
        assertEquals(displayWinner8.toString(),"C'est la "+ comparaison8 + " qui gagne avec "+comparaison8.getMethodeComparaison()+" : "+comparaison8.getWinningCard());
        assertEquals(displayWinner9.toString(),"C'est la "+ comparaison9 + " qui gagne avec "+comparaison9.getMethodeComparaison()+" : "+comparaison9.getWinningCard());
        assertEquals(displayWinner10.toString(),"C'est la "+ comparaison10 + " qui gagne avec "+comparaison10.getMethodeComparaison()+" : "+comparaison10.getWinningCard());
        assertEquals(displayWinner11.toString(),"C'est la "+ comparaison11 + " qui gagne avec "+comparaison11.getMethodeComparaison()+" : "+comparaison11.getWinningCard());
        assertEquals(displayWinner12.toString(),"C'est la "+ comparaison12 + " qui gagne avec "+comparaison12.getMethodeComparaison()+" : "+comparaison12.getWinningCard());
        assertEquals(displayWinner13.toString(),"C'est la "+ comparaison13 + " qui gagne avec "+comparaison13.getMethodeComparaison()+" : "+comparaison13.getWinningCard());


    }



}


