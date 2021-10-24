package comparaison;

import poker.Hand;

public class Full {
    private Hand hand;
    private Brelan brelan;
    private Paire paire;


    public Full(Hand cartes){
        hand = cartes;
        brelan = new Brelan(cartes.getSortedCard());
        paire = new Paire(cartes.getSortedCard());
    }

    /**
     *
     * @return
     */
    public boolean isFull(){
        boolean isBrelan = brelan.isBrelan();
        boolean isPaire = paire.isPaire();
        if (isBrelan && isPaire) {
            boolean justBrelan = !brelan.getCarteBrelan().sameValue(paire.getMaxPaire());

            return justBrelan;
        }
        return false;
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
    public Brelan getBrelan() {
        return brelan;
    }


}


