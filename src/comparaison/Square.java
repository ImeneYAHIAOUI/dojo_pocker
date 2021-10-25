package comparaison;

import poker.Carte;

import java.util.ArrayList;

public class Square {
    private ArrayList<Carte> cards;
    private Carte SquareCard;

    /**
     *
     * @param cards la liste de cartes dois être triée pour que la méthode isSquare fonctionne bien
     */
    public Square(ArrayList<Carte> cards){

        this.cards = cards;
        SquareCard = cards.get(2);  /*parce que la list cards est triée, si on a 4 cartes de la même valeur
                                      la carte de position 2 est forcement une de ces cartes*/
    }

    /**
     *
     * @return on vérifie si les valeurs des 4 premieres carte sont identiques, sinon
     * on regarde si c'est le cas pour les 4 dernieres
     */
    public boolean isSquare(){

        boolean isSquare = true;

        for (int i = 0; i < 4; i++){
            isSquare = isSquare && cards.get(i).sameValue(SquareCard);

        }
        if (isSquare) {
            return isSquare;
        }

        isSquare = true;
        for (int i = 1; i < 5; i++){
            isSquare = isSquare && cards.get(i).sameValue(SquareCard);
        }

        return isSquare;

    }

    /**
     *
     * @return on renvoie la carte carré si elle existe, sinon on renvoie un null
     * */
    public Carte getSquareCard(){
        if(this.isSquare()) return SquareCard;
        return null;
    }

}
