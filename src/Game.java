public class Game {

    private final int NB_CARTE_MAIN = 1;
    private Main main1, main2;

    /*
    * On déclare les 2 objets mains
    *
    * Création de l'objet comparaison qui fait appel à la class avec comme param les 2 mains
    * On print le retour de la méthode comparaison qui renvoie la carte qui a permit de gagner
    *
    * */
    public Game(){
        System.out.println("Faites chauffer votre clavier");
        System.out.println("Entrer les cartes de la main 1");
        main1 = new Main();
        main2 = new Main();
        System.out.println("Voici vos cartes : " + main1.getCarte() + " et " + main2.getCarte());

        //Etape comparaison
        System.out.println("Le gagnant à la carte: "+comparaison());
        //System.out.println(main1.getMaxCarte());
        //System.out.println(main2.getMaxCarte());
    }

    public String comparaison(){
        Comparaison comp1 = new Comparaison(main1, main2);
        return comp1.toString();
    }
}
