import java.util.ArrayList;

public class Comparaison {

    private Main Cartes_Main_1;
    private Main Cartes_Main_2;
    private final int NB_CARTE_MAIN = 2;
    private String vainqueur;
    private Integer paire_vainqueur=0;

    public Comparaison(Main main1, Main main2){
        Cartes_Main_1 = main1;
        Cartes_Main_2 = main2;

        //Test de paire
        Paire paire_main1 = new Paire(Cartes_Main_1.getCarte());
        Paire paire_main2 = new Paire(Cartes_Main_2.getCarte());

        if (paire_main1.isPaire() && !paire_main2.isPaire()) System.out.println("C'est la main 1 qui gagne avec la carte "+paire_main1);
        else System.out.println("C'est la main 2 qui gagne avec "+paire_main2);
        //System.out.println("main1 paire "+paire_main1.isPaire());
        //System.out.println("main2 paire "+paire_main2.isPaire());
        if(!paire_main1.isPaire() && !paire_main2.isPaire()) comparaison_valeur_haute();
    }

    /*
    * Comparaison listes de 2 cartes:
    *   - Trier avec la valeur la plus haute pour chaque main
    *   - Comparer les 2 resultats et hop !!
    * */

    public String comparaison_valeur_haute(){

        if(toInt(Cartes_Main_1.getMaxCarte()) == toInt(Cartes_Main_2.getMaxCarte())){
            return "Egalité les enfants !";
        }
        if (toInt(Cartes_Main_1.getMaxCarte()) < toInt(Cartes_Main_2.getMaxCarte())){
            return Cartes_Main_2.getMaxCarte();
        }else{
            return Cartes_Main_1.getMaxCarte();
        }
    }

    public int toInt(String carteToInt){
        return Integer.parseInt(carteToInt);
    }

    public String toString(){
        return vainqueur;
    }
}
