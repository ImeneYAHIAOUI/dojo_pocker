
public class Comparaison {

    private final Hand Cartes_Main_1;
    private final Hand Cartes_Main_2;
    private int winner;
    private Carte winningCard;
    private String methodeComparaison;


    /**
     *
     * @param main1
     * @param main2
     */
    public Comparaison(Hand main1, Hand main2){
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
    public Carte comparaisonSuite(Hand main1, Hand main2){

        if (main1.isSorted() && !main2.isSorted()){
            winner = 1;
            return null;
        }
        if (!main1.isSorted() && main2.isSorted()){
            winner = 2;
            return null;
        }

        return comparaison_valeur_haute(main1.getMaxCarte(),main2.getMaxCarte());

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

    public Carte comparaison2Paires(Paire paire1, Paire paire2){
        if(paire1.is2Paire() && !paire2.is2Paire()){
            winner = 1;

            return paire1.getMaxPaire();

        }else if (!paire1.is2Paire() && paire2.is2Paire()) {
            winner = 2;
            return paire2.getMaxPaire();
        }
        return comparaison_valeur_haute(paire1.getMaxPaire(),paire2.getMaxPaire());



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
        Brelan brelan1 = new Brelan(Cartes_Main_1.getSortedCard());
        Brelan brelan2 = new Brelan(Cartes_Main_2.getSortedCard());

        Paire paire_main1 = new Paire(Cartes_Main_1.getSortedCard());
        Paire paire_main2 = new Paire(Cartes_Main_2.getSortedCard());

        if (Cartes_Main_1.isSorted() || Cartes_Main_2.isSorted()){
            winningCard = comparaisonSuite(Cartes_Main_1,Cartes_Main_2);
            methodeComparaison = "suite";
        }



        else if(brelan1.isBrelan() || brelan2.isBrelan()){
            winningCard = comparaisonBrelans(brelan1,brelan2);
            methodeComparaison = "brelan";

        }

        else if(paire_main1.is2Paire() || paire_main2.is2Paire()){
            winningCard = comparaison2Paires(paire_main1,paire_main2);
            methodeComparaison = "double paire";
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
