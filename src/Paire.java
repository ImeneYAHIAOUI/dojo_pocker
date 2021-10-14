import java.util.ArrayList;
import java.util.Collections;

public class Paire{

    ArrayList<Carte> cartes_main;
    ArrayList<Integer> carte_paire = new ArrayList<>();
    int ValeurMaxPaire;


    /**
     *
     * @param Cartes_main
     */
    public Paire(ArrayList<Carte> Cartes_main){
        this.cartes_main = Cartes_main;


        for (int i = 1;i<cartes_main.size(); i++){

            Carte currentCard = cartes_main.get(i-1);
            Carte nextCard = cartes_main.get(i);

            if(currentCard.sameValue(nextCard)){
                carte_paire.add(currentCard.getIntValue());
            }
        }

        Collections.sort(carte_paire);
    }

    public boolean isPaire(){
        int nbPaire = carte_paire.size();

        if(nbPaire==2){
            ValeurMaxPaire = carte_paire.get(nbPaire-1);
            return true;
        }
        if(nbPaire == 1){
            ValeurMaxPaire = carte_paire.get(0);
            return true;
        }
        return false;
    }

    public Carte getMaxPaire(){
        return new Carte(Integer.toString(ValeurMaxPaire));
    }


    public String toString(){
        return String.valueOf(ValeurMaxPaire);
    }






}