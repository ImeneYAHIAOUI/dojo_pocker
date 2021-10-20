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
     * @param cards
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
     * @return
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
     * @return
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
     * @return
     */
    public Carte getMaxPaire(){
        if(ValeurMaxPaire != 0) return new Carte(Integer.toString(ValeurMaxPaire));
        else return null;
    }

    public int getValeurMaxPaire(){
        return ValeurMaxPaire;
    }

    public int nbPaire(){
        return carte_paire.size();
    }

    /**
     *
     * @return
     */
    public String toString(){
        return String.valueOf(ValeurMaxPaire);
    }

}