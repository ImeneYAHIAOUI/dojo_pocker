package comparaison;

import poker.Hand;

public class Full {
    private Hand hand;
    private Brelan brelan;
    private Paire paire;

    /**
     *
     * @param cartes une main full doit contenir un brelan et une paire, le constructeur prend en parametre
     *               une main et l'utilise pour créer un objet brelan et un objet paire
     */
    public Full(Hand cartes){
        hand = cartes;
        brelan = new Brelan(cartes.getSortedCard());
        paire = new Paire(cartes.getSortedCard());
    }

    /**
     *
     * @return on pour vérifier si la main est full, on doit regarder si elle est a la fois paire et brelan
     * et que la carte paire est differente de la carte brelan
     * exemple: 3 7 7 3 3 est full
     *          4 4 4 3 2 n'est pas full
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
     * @return getter de la main
     */
    public Hand getHand(){
        return hand;
    }

    /**
     *
     * @return getter du brelan
     */
    public Brelan getBrelan() {
        return brelan;
    }



}


