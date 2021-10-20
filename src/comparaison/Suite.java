package comparaison;

import java.util.ArrayList;
import poker.Hand;
public class Suite {

    private Hand hand;
    private Brelan brelan;
    private Paire paire;

    public Suite(Hand hand){
        this.hand = hand;
        brelan = new Brelan(hand.getSortedCard());
        paire = new Paire(hand.getSortedCard());
    }

    /**
     *
     * @return
     */
    public Hand getHand(){
        return hand;
    }


    /**
     *
     * @return
     */
    public boolean isSuite(){
        return hand.isSorted() && !brelan.isBrelan() && !paire.isPaire();

    }

}
