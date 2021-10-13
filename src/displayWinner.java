public class displayWinner {
    private String winner;
    private Carte winningCard;
    private String methodeComparaison;

    public displayWinner(String winner, Carte winningCard, String methodeComparaison){
        this.winner = winner;
        this.winningCard = winningCard;
        this.methodeComparaison = methodeComparaison;
    }
    public String toString(){
        if(winner.equals("Egalité")){
            return winner;
        }
        return "C'est la "+winner+" qui gagne avec "+methodeComparaison+" : " + winningCard;
    }
}
