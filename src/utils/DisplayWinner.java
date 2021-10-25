package utils;

import poker.Comparaison;
import poker.Carte;

public class DisplayWinner {
    private final Comparaison winner;

    /**
     *
     * @param winner cette objet Comparaison cert à récupérer la main gagnante, la carte gagnat si elle existe
     *               est la méthode de comparaison utilisée
     */
    public DisplayWinner(Comparaison winner){
        this.winner = winner;

    }

    /**
     *
     * @return on renvoie le message final du résutat de la partie
     */

    @Override
    public String toString(){
        Carte winningCard = winner.getWinningCard();
        String methode = winner.getMethodeComparaison();

        if(winner.toString().equalsIgnoreCase("Egalité")){
            return winner.toString();
        }
        if(methode.equalsIgnoreCase("suite") || methode.equalsIgnoreCase("full")){
            if(winningCard==null) {
                return "C'est la " + winner + " qui gagne car c'est une main "+methode;
            }
            return "C'est la " + winner + " qui gagne car c'est la main "+methode+" la plus puissante grace à la carte : "+winningCard;

        }
        return "C'est la "+winner+" qui gagne avec "+methode+" : " + winningCard;
    }
}
