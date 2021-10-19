package comparaison;

import java.util.ArrayList;
import poker.Carte;


public class Brelan {
    ArrayList<Carte> cards;
    Carte carteBrelan;

    /**
     *
     * @param cards
     */
    public Brelan(ArrayList<Carte> cards){
        this.cards = cards;
        for (int i = 2;i<cards.size(); i++){
            Carte previewsCard = cards.get(i-2);
            Carte currentCard = cards.get(i-1);
            Carte nextCard = cards.get(i);

            if(previewsCard.sameValue(currentCard) && currentCard.sameValue(nextCard)){
                carteBrelan = cards.get(i);
                break;
            }
        }

    }

    /**
     *
     * @return
     */
    public boolean isBrelan(){
        return carteBrelan != null;
    }

    /**
     *
     * @return
     */
    public Carte getCarteBrelan() {
        return carteBrelan;
    }


    /**
     *
     * @return
     */
    public String toString(){
        return carteBrelan.toString();
    }
}