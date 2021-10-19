public class displayWinner {
    private final Comparaison winner;

    public displayWinner(Comparaison winner){
        this.winner = winner;

    }
    public String toString(){
        Carte winningCard = winner.getWinningCard();
        String methode = winner.getMethodeComparaison();

        if(winner.toString().equals("Egalité")){
            return winner.toString();
        }
        if(methode.equals("suite") || methode.equals("full")){
            if(winningCard==null) {
                return "C'est la " + winner + " qui gagne " + "car c'est une main "+methode;
            }
            return "C'est la " + winner + " qui gagne " + "car c'est la main "+methode+" la plus puissante grace à la carte : "+winningCard;

        }
        return "C'est la "+winner+" qui gagne avec "+methode+" : " + winningCard;
    }
}
