package comparaison;

import java.util.ArrayList;
import java.util.Collections;
import poker.Carte;

public class Paire{

    ArrayList<Carte> cards;
    ArrayList<Integer> carte_paire = new ArrayList<>();
    int ValeurMaxPaire;


    /**
     *
     * @param cards la liste de cartes dois être triée pour que les méthodes isPaire et is2Paire
     *              fonctionnent bien
     *              le constructeur initilise cards et remplie la carte_paire par les valeurs
     *              de paires trouvés
     *
     *              exemple: 2 3 4 2 8 -> carte_paire = [2]
     *                       4 3 4 3 5 -> carte_paire = [4,3]
     *                       3 9 8 2 7 -> carte_paire = []
     */
    public Paire(ArrayList<Carte> cards){
        this.cards = cards;

        for (int i = 1;i<cards.size(); i++){

            Carte currentCard = cards.get(i-1);
            Carte nextCard = cards.get(i);

            if(currentCard.sameValue(nextCard) && ! carte_paire.contains(currentCard.getIntValue())){
                carte_paire.add(currentCard.getIntValue());
            }
        }

        Collections.sort(carte_paire);
    }

    /**
     *
     * @return si carte_paire contient 2 elements, la main contient 2 paires distincts
     * donc c'est une main deuxPaires.
     * la valeur de la paire la plus puissante est dans le deuxieme élément de carte_paire la liste des
     * cartes est déjà triée
     */
    public boolean is2Paire(){
        int nbPaire = carte_paire.size();

        if(nbPaire == 2){
            ValeurMaxPaire = carte_paire.get(nbPaire-1);
            return true;
        }
        return false;
    }

    /**
     *
     * @return si carte_paire n'est pas vide, la main contient au moin une paire
     *      donc c'est une main paire
     *
     */
    public boolean isPaire(){
        int nbPaire = carte_paire.size();

        if(nbPaire > 0){
            ValeurMaxPaire = carte_paire.get(0);
            return true;
        }
        return false;
    }

    /**
     *
     * @return getter de la carte de la paire la plus puissante
     */
    public Carte getMaxPaire(){
        if(ValeurMaxPaire != 0) return new Carte(Integer.toString(ValeurMaxPaire));
        else return null;
    }

    /**
     *
     * @return getter de la valeur de la carte paire la plus puissante
     */
    public int getValeurMaxPaire(){
        return ValeurMaxPaire;
    }

    public Carte getMinPaire(){
        if(is2Paire()) return new Carte(Integer.toString(carte_paire.get(0)));
        return null;
    }
}