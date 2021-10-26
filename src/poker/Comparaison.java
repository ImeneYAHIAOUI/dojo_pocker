package poker;

import comparaison.*;

public class Comparaison {

    private final Hand hand1;
    private final Hand hand2;
    private int winner;
    private Carte winningCard;
    private String methodeComparaison;


    /**
     *
     * @param main1
     * @param main2
     * le constructeur initialise les deux mains,puis fais appelle a la méthode winnerSetter qui fait
     * les comparaisons nécessaires pour initialiser winner, winningCart et methodeComparaison.
     */
    public Comparaison(Hand main1, Hand main2){
        hand1 = main1;
        hand2 = main2;
        winnerSetter();
    }

    /*
    * poker.Comparaison listes de 2 cartes:
    *   - Trier avec la valeur la plus haute pour chaque main
    *   - Comparer les 2 resultats et hop !!
    * */


    /**
     *
     * @param BestCard1 meilleure carte de main1
     * @param BestCard2 meilleure carte de main2
     * @return cette méthode renvoie la main gagnante obtenue par comparaison des valeurs des deux cartes passées
     * en parametres. En cas d'égalité, en renvoie un null
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
     * @param Square1 objet Square de la main1
     * @param Square2 objet Square de la main1
     * @return cette méthode renvoie la main gagnante obtenue en vérifiant quelle main est Square,
     *      si c'est le cas pour les deux, on renvoie le résultat
     *      de comparaison_valeur_haute(Square1.getSquareCard(),Square2.getSquareCard())
     */
    public Carte comparaisonSquare(Square Square1, Square Square2){
        if (Square1.isSquare() && !Square2.isSquare()){
            winner = 1;
            return Square1.getSquareCard();
        }
        if (!Square1.isSquare() && Square2.isSquare()){
            winner = 2;
            return Square2.getSquareCard();
        }
        return comparaison_valeur_haute(Square1.getSquareCard(),Square2.getSquareCard());
    }

    /**
     *
     * @param full1 objet Full de main1
     * @param full2 objet Full de main2
     * @return cette méthode renvoie la main gagnante obtenue en vérifiant quelle main est full,
     *         si c'est le cas pour les deux, on renvoie le résultat
     *         de comparaison_valeur_haute(full1.getBrelan(), full2.getBrelan())
     */
    public Carte comparaisonFull(Full full1, Full full2){
        if (full1.isFull() && !full2.isFull()){
            winner = 1;
            return null;
        }
        if (!full1.isFull() && full2.isFull()){
            winner = 2;
            return null;
        }
        return comparaisonBrelans(full1.getBrelan(), full2.getBrelan());
    }

    /**
     *
     * @param suite1 objet Suite de main1
     * @param suite2 objet Suite de main2
     * @return cette méthode renvoie la main gagnante obtenue en vérifiant quelle main est une suite,
     *         si c'est le cas pour les deux, on renvoie le résultat
     *         de comparaison_valeur_haute(main1.getMaxCarte(),main2.getMaxCarte)
     */
    public Carte comparaisonSuite(Suite suite1, Suite suite2){
        if (suite1.isSuite() && !suite2.isSuite()){
            winner = 1;
            return null;
        }
        if (!suite1.isSuite() && suite2.isSuite()){
            winner = 2;
            return null;
        }
        Hand hand1 = suite1.getHand();
        Hand hand2 = suite2.getHand();
        return comparaison_valeur_haute(hand1.getMaxCarte(),hand2.getMaxCarte());

    }

    /**
     *
     * @param carte1 objet Brelan de main1
     * @param carte2 objet Brelan de main2
     * @return cette méthode renvoie la main gagnante obtenue en vérifiant quelle main contient un brelan,
     *         si c'est le cas pour les deux, on renvoie le résultat
     *         de comparaison_valeur_haute(carte1.getCarteBrelan(), carte2.getCarteBrelan())
     */

    public Carte comparaisonBrelans(Brelan carte1, Brelan carte2){

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
     * @param paire1 objet paire de main1
     * @param paire2 objet paire de main2
     * @return cette méthode renvoie la main gagnante obtenue en vérifiant quelle main contient deux paires distincts,
     *         si c'est le cas pour les deux, on renvoie le résultat
     *         de comparaison_valeur_haute(paire1.getMaxPaire(),paire2.getMaxPaire())
     */
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
     * @param paire1 objet Paire de main1
     * @param paire2 objet Paire de main2
     * @return cette méthode renvoie la main gagnante obtenue en vérifiant quelle main contient une paire,
     *         si c'est le cas pour les deux, on renvoie le résultat
     *         de comparaison_valeur_haute(paire1.getMaxPaire(),paire2.getMaxPaire())
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

    /**
     * Setter de winner, winnerCard et winner et winningMethode
     * on crée des objets Square, Suite, Full, Brelan et Paire pour les deux main
     * et on vérifie en fonction de la priorité des méthodes de comparaison
     * les caractéristique des mains pour choisir quel méthode de comparaison utiliser.
     */
    public void winnerSetter(){
        Square Square1 = new Square(hand1.getSortedCard());
        Square Square2 = new Square(hand2.getSortedCard());

        Suite suite1 = new Suite(hand1);
        Suite suite2 = new Suite(hand2);

        Full full1 =new Full(hand1);
        Full full2 =new Full(hand2);

        Brelan brelan1 = new Brelan(hand1.getSortedCard());
        Brelan brelan2 = new Brelan(hand2.getSortedCard());

        Paire paire_main1 = new Paire(hand1.getSortedCard());
        Paire paire_main2 = new Paire(hand2.getSortedCard());

        if (Square1.isSquare() || Square2.isSquare()){
            winningCard = comparaisonSquare(Square1,Square2);
            methodeComparaison = "carré";

        }
        else if (full1.isFull() || full2.isFull()){
            winningCard = comparaisonFull(full1,full2);
            methodeComparaison = "full";
        }
        else if (suite1.isSuite() || suite2.isSuite()){
            winningCard = comparaisonSuite(suite1,suite2);
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
            winningCard = comparaison_valeur_haute(hand1.getMaxCarte(), hand2.getMaxCarte());
            methodeComparaison = "valeur la plus élevée";
        }

    }


    /**
     *
     * @return getter carte gagnante, si elle n'existe pas, on renvoie un null
     */
    public Carte getWinningCard(){
        return winningCard;
    }

    /**
     *
     * @return getter de la méthode de comparaison
     */
    public String getMethodeComparaison(){
        return methodeComparaison;
    }

    /**
     *
     * @return un objet comparaison affiche la main gagnate ou égalité
     */
    @Override
    public String toString(){
        return switch (winner){
            case 1 -> "main 1";
            case 2 -> "main 2";
            default -> "Egalité";
        };
    }
}
