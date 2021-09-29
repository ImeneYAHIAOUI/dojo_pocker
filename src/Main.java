import java.util.ArrayList;
import java.util.Collections;

public class Main {

    //private Carte carte;
    private ArrayList<Carte> cartes = new ArrayList<>();
    private ArrayList<Integer> cartestriees = new ArrayList<>();
    private final int NB_CARTE_MAIN = 2;
    private String MaxCarte;

    /*
    * Instance de chaque carte définie par la variable NB_CARTE_MAIN
    *
    * Un getCarte pour retourner la liste de carte
    * */

    public Main(){
        for (int i = 0; i < NB_CARTE_MAIN; i++){
            cartes.add(new Carte(new InputReader().toString()));
        }
        //System.out.println(carte.getValue());
        getTrieCartes();
    }

    public ArrayList<Carte> getCarte(){
        return cartes;
    }

    //on trie les cartes de la main en fonction de leurs valeurs
    public void getTrieCartes(){
        ArrayList<Integer> cartesTrie = new ArrayList<>();
        for(int i =0; i<cartes.size(); i++){
            cartesTrie.add(cartes.get(i).getIntValue());
        }
        Collections.sort(cartesTrie);
        MaxCarte = Integer.toString(cartesTrie.get(cartesTrie.size()-1));
    }

    public String getMaxCarte(){
        return MaxCarte;
    }


    //public String toString(){ return on verra;
    //}
}
