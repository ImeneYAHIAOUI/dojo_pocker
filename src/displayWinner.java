public class displayWinner {
    private Comparaison winner;

    public displayWinner(Comparaison winner){
        this.winner = winner;

    }
    public String toString(){
        if(winner.toString().equals("Egalité")){
            return winner.toString();
        }
        return "C'est la "+winner+" qui gagne avec "+winner.getMethodeComparaison()+" : " + winner.getWinningCard();
    }
}
