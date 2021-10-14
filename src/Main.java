import java.util.ArrayList;
import java.util.Collections;

public class Main {

    //private Carte carte;
    public ArrayList<Carte> cartes = new ArrayList<>();
    private ArrayList<Integer> cartestriees = new ArrayList<>();
    private Carte MaxCarte;

    public Main(){
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
        for(int i =0; i<cartes.size(); i++){
            cartesTrie.add(cartes.get(i).getIntValue());
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
