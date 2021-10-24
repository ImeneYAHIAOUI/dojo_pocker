package comparaison;

import poker.Carte;

import java.util.ArrayList;

public class Square {
    private ArrayList<Carte> cards;
    private Carte SquareCard;

    public Square(ArrayList<Carte> cards){

        this.cards = cards;
        SquareCard = cards.get(2);
    }

    /**
     *
     * @return
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
     * @return
     */
    public Carte getSquareCard(){
        if(this.isSquare()) return SquareCard;
        return null;
    }

}
