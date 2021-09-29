public class Comparaison {

    private Main Cartes_Main_1;
    private Main Cartes_Main_2;
    private final int NB_CARTE_MAIN = 2;
    private String vainqueur;

    public Comparaison(Main main1, Main main2){
        Cartes_Main_1 = main1;
        Cartes_Main_2 = main2;
        vainqueur = comparaison_valeur_haute();
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
