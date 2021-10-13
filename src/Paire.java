import java.util.ArrayList;
import java.util.Collections;

public class Paire{

    ArrayList<Carte> cartes_main;
    ArrayList<Integer> carte_paire = new ArrayList<>();
    int ValeurMaxPaire;


    //boucle qui permet de détecter les paires (ici plusieurs si besoin)
    public Paire(ArrayList<Carte> Cartes_main){
        this.cartes_main = Cartes_main;
        for (int i = 1;i<cartes_main.size(); i++){
            if(cartes_main.get(i-1).getIntValue().equals(cartes_main.get(i).getIntValue())) carte_paire.add(cartes_main.get(i).getIntValue());
        }

        Collections.sort(carte_paire);
    }

    public boolean isPaire(){
        if(carte_paire.size()==2){
            ValeurMaxPaire = carte_paire.get(1);
            return true;
        }
        if(carte_paire.size() == 1){
            ValeurMaxPaire = carte_paire.get(0);
            return true;
        }
        return false;
    }

    public String toString(){
        return String.valueOf(ValeurMaxPaire);
    }






}