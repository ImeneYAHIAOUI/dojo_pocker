import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    //private Carte carte;
    public ArrayList<Carte> cartes;
    private Carte MaxCarte;

    public Hand(){
        cartes = new InputReader().getMain_joueur();
        getTrieCartes();
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

}
