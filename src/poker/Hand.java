package poker;

import utils.InputReader;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    public ArrayList<Carte> cartes;
    public ArrayList<Carte> sortedCards = new ArrayList<>();
    private Carte MaxCarte;

    /**
     * le constructeur Hand() fait appelle à un objet InputReader() pour récupérer la liste des cartes
     * de l'entrée standard
     * si la liste reçu n'est pas null, on la trie avec la méthodegetTrie Cartes
     */
    public Hand() {
        cartes = new InputReader().getMain_joueur();

        if (cartes != null) getTrieCartes();
    }

    /**
     *
     * @param cartes ce constructeur est utile si on veut créer un objet hand sans passer par l'entrée
     *               standard
     */
    public Hand(ArrayList<Carte> cartes){
        this.cartes = cartes;

        if (cartes != null) getTrieCartes();
    }
    /**
     *
     * @return getter de la liste des cartes
     */
    public ArrayList<Carte> getCartes(){
        return cartes;
    }

    /**on trie les cartes de la main en fonction de leurs valeurs
     * cela sera utile pour les differentes méthodes de comparaison existant dans ce jeu
     */

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
     * @return getter la carte avec la valeur la plus élevée
     */
    public Carte getMaxCarte(){
        return MaxCarte;
    }

    /**
     *
     * @return getter de la liste de cartes triée
     */
    public ArrayList<Carte> getSortedCard() {
        return sortedCards;
    }

    /**
     *
     * @return cette méthode vérifie si la main contient des valeurs consecutives
     * elle est utile pour vérifier si une main est une suite
     */
    public boolean isConsecutive(){
        for (int i=1 ; i<cartes.size() ;i++){
            if ( cartes.get(i).intValue != cartes.get(i-1).intValue+1){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return cette méthode vérifie si tous les cartes de la main sont de la même valeur.
     * si c'est le cas, il faut demander au joueur de saisir une nouvelle main (voir classe Game)
     *
     */
    public boolean SameValueCards(){
        for (int i=1 ; i<cartes.size() ;i++){
            if (!cartes.get(i).sameValue(cartes.get(i-1))){
                return false;
            }
        }
        System.out.print("On ne peut pas avoir 5 cartes de la même valeur\nveuillez saisir une nouvelle main: ");
        return true;
    }
}
