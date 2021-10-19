import java.util.ArrayList;

public class Full {
    private Hand hand;
    private Brelan brelan;
    private Paire paire;
    public Full(Hand cartes){
        hand = cartes;
        brelan = new Brelan(cartes.getSortedCard());
        paire = new Paire(cartes.getSortedCard());
    }

    public boolean isFull(){
        return brelan.isBrelan() && paire.isPaire() ;
    }

    public Hand getHand(){
        return hand;
    }
    public Brelan getBrelan() {
        return brelan;
    }

    public Paire getPaire() {
        return paire;
    }
}


