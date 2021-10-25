package comparaison;

import java.util.ArrayList;
import poker.Hand;
public class Suite {

    private Hand hand;
    private Brelan brelan;
    private Paire paire;



    public Suite(Hand hand){
        this.hand = hand;
    }


    /**
     *
     * @return la méthode isConsecutive() vérifie si la main contient des valeurs consicutives,
     *il suffis de l'appeller pour verifier si une main est une suite
     */
    public boolean isSuite(){
        return hand.isConsecutive();

    }


    /**
     *
     * @return getter de la main
     */
    public Hand getHand(){
        return hand;
    }




}
