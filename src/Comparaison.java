
public class Comparaison {

    private final Main Cartes_Main_1;
    private final Main Cartes_Main_2;
    private int winner;
    private Carte winningCard;
    private String methodeComparaison;


    /**
     *
     * @param main1
     * @param main2
     */
    public Comparaison(Main main1, Main main2){
        Cartes_Main_1 = main1;
        Cartes_Main_2 = main2;
        winnerSetter();
    }

    /*
    * Comparaison listes de 2 cartes:
    *   - Trier avec la valeur la plus haute pour chaque main
    *   - Comparer les 2 resultats et hop !!
    * */


    /**
     *
     * @param BestCard1
     * @param BestCard2
     * @return
     */
    public Carte comparaison_valeur_haute(Carte BestCard1,Carte BestCard2){

        if(BestCard1.getIntValue() > BestCard2.getIntValue()){

            winner = 1;
            return BestCard1;
        }
        if (BestCard1.getIntValue() < BestCard2.getIntValue()){
            winner = 2;
            return BestCard2;
        }else{
            winner = 0;
            return null;
        }
    }

    /**
     *
     * @param carte1
     * @param carte2
     * @return
     */
    public Carte comparaisonBrelans(Brelan carte1,Brelan carte2){

        if(carte1.isBrelan() && !carte2.isBrelan()){
            winner = 1;
            return carte1.getCarteBrelan();
        }
        if(!carte1.isBrelan() && carte2.isBrelan()){
            winner = 2;
            return carte2.getCarteBrelan();
        }else{
            return comparaison_valeur_haute(carte1.getCarteBrelan(), carte2.getCarteBrelan());
        }

    }

    /**
     *
     * @param paire1
     * @param paire2
     * @return
     */
    public Carte comparaisonPaires(Paire paire1, Paire paire2){
        if(paire1.isPaire() && !paire2.isPaire()){
            winner = 1;
            return paire1.getMaxPaire();
        }else if (!paire1.isPaire() && paire2.isPaire()) {
            winner = 2;
            return paire2.getMaxPaire();
        }
        return comparaison_valeur_haute(paire1.getMaxPaire(),paire2.getMaxPaire());

    }

    public void winnerSetter(){
        Brelan brelan1 = new Brelan(Cartes_Main_1.getCartes());
        Brelan brelan2 = new Brelan(Cartes_Main_2.getCartes());

        Paire paire_main1 = new Paire(Cartes_Main_1.getCartes());
        Paire paire_main2 = new Paire(Cartes_Main_2.getCartes());

        if(brelan1.isBrelan() || brelan2.isBrelan()){
            winningCard = comparaisonBrelans(brelan1,brelan2);
            methodeComparaison = "brelan";

        }


        else if (paire_main1.isPaire() || paire_main2.isPaire()){
            winningCard = comparaisonPaires(paire_main1,paire_main2);
            methodeComparaison = "paire";
        }
        else {
            winningCard = comparaison_valeur_haute(Cartes_Main_1.getMaxCarte(), Cartes_Main_2.getMaxCarte());
            methodeComparaison = "valeur la plus élevée";
        }

    }


    /**
     *
     * @return
     */
    public Carte getWinningCard(){
        return winningCard;
    }

    /**
     *
     * @return
     */
    public String getMethodeComparaison(){
        return methodeComparaison;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return switch (winner){
            case 1 -> "main 1";
            case 2 -> "main 2";
            default -> "Egalité";
        };
    }




}
