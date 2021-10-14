import java.util.ArrayList;


public class Brelan {
    ArrayList<Carte> cartes_main;
    Carte carteBrelan;

    /**
     *
     * @param Cartes_main
     */
    public Brelan(ArrayList<Carte> Cartes_main){
        this.cartes_main = Cartes_main;
        for (int i = 2;i<cartes_main.size(); i++){
            Carte previewsCard = cartes_main.get(i-2);
            Carte currentCard = cartes_main.get(i-1);
            Carte nextCard = cartes_main.get(i);

            if(previewsCard.sameValue(currentCard) && currentCard.sameValue(nextCard)){
                carteBrelan = cartes_main.get(i);
                break;
            }
        }

    }

    /**
     *
     * @return
     */
    public boolean isBrelan(){
        return carteBrelan != null;
    }

    /**
     *
     * @return
     */
    public Carte getCarteBrelan() {
        return carteBrelan;
    }


    /**
     *
     * @return
     */
    public String toString(){
        return carteBrelan.toString();
    }
}