public class Game {

    private final Main main1, main2;

    /*
     * On déclare les 2 objets mains
     *
     * Création de l'objet comparaison qui fait appel à la class avec comme param les 2 mains
     * On print le retour de la méthode comparaison qui renvoie la carte qui a permit de gagner
     *
     * */
    public Game(){
        System.out.print("Main 1: ");
        main1 = new Main();
        System.out.print("Main 2: ");
        main2 = new Main();
        System.out.println("Voici vos cartes : " + main1.getCartes() + " et " + main2.getCartes());

        //Etape comparaison
        Comparaison winningHand = new Comparaison(main1,main2);

        String winner = winningHand.toString();
        Carte winningCard = winningHand.getWinningCard();
        String methodeComparaison = winningHand.getMethodeComparaison();

        System.out.println(new displayWinner(winner,winningCard,methodeComparaison));



    }


}
