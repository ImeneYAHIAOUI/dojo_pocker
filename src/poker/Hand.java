package poker;

import utils.InputReader;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    public ArrayList<Carte> cartes;
    public ArrayList<Carte> sortedCards = new ArrayList<>();
    private Carte MaxCarte;


    public Hand(){
        cartes = new InputReader().getMain_joueur();

        if (!(cartes == null)) getTrieCartes();
    }

    /**
     *
     * @return
     */
    public ArrayList<Carte> getCartes(){
        return cartes;
    }

    //on trie les cartes de la main en fonction de leurs valeurs
    public void getTrieCartes(){
        ArrayList<Integer> cartesTrie = new ArrayList<>();
        for (Carte carte : cartes) {
            cartesTrie.add(carte.getIntValue());
        }
        Collections.sort(cartesTrie);
        for (Integer c : cartesTrie){
            String card = Integer.toString(c);
            sortedCards.add(new Carte(card));
        }
        String Max = Integer.toString(cartesTrie.get(cartesTrie.size()-1));
        MaxCarte = new Carte(Max);

    }

    /**
     *
     * @return
     */
    public Carte getMaxCarte(){
        return MaxCarte;
    }

    /**
     *
     * @return
     */
    public ArrayList<Carte> getSortedCard() {
        return sortedCards;
    }

    public boolean isConsecutive(){
        for (int i=1 ; i<cartes.size() ;i++){
            if ( cartes.get(i).intValue != cartes.get(i-1).intValue+1){
                return false;
            }
        }
        return true;
    }

    public boolean SameValueCards(){
        for (int i=1 ; i<cartes.size() ;i++){
            if (!cartes.get(i).sameValue(cartes.get(i-1))){
                return false;
            }
        }
        return true;
    }
}
