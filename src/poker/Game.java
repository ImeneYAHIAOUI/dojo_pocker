package poker;

import utils.displayWinner;

public class Game {

    private final Hand main1, main2;

    /*
     * On déclare les 2 objets mains
     *
     * Création de l'objet comparaison qui fait appel à la class avec comme param les 2 mains
     * On print le retour de la méthode comparaison qui renvoie la carte qui a permit de gagner
     *
     * */
    public Game(){
        System.out.print("Main 1: ");
        main1 = new Hand();
        System.out.print("Main 2: ");
        main2 = new Hand();
        System.out.println("Voici vos cartes : " + main1.getCartes() + " et " + main2.getCartes());

        //Etape comparaison
        Comparaison winningHand = new Comparaison(main1,main2);


        System.out.println(new displayWinner(winningHand));



    }


}
