package comparaison;

import java.util.ArrayList;
import poker.Carte;


public class Brelan {
    ArrayList<Carte> sortedCards;
    Carte carteBrelan;

    /**
     *
     * @param cards la liste de cartes dois être triée pour que la méthode isBrelan fonctionne bien,
     *              c'est pour cela que à chaque fois quand veut créer un objet brelan à partir d'une main
     *              il faut toujours utiliser main.getSortedCards()
     */
    public Brelan(ArrayList<Carte> cards){
        this.sortedCards = cards;
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
     * @return Si on ne trouve pas un brelan, l'attribue carteBrelan ne sera jamais initialisé,
     * donc vérifier si carteBrelan est null suffis pour savoir si la main contient un brelan
     */
    public boolean isBrelan(){
        return carteBrelan != null;
    }

    /**
     *
     * @return on retourne la carte brelan si elle existe, sinon on retourne un null
     */
    public Carte getCarteBrelan() {
        return carteBrelan;
    }



}