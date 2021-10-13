import java.util.ArrayList;


public class Brelon {
    ArrayList<Carte> cartes_main;
    Carte carteBrelon;

    public Brelon(ArrayList<Carte> Cartes_main){
        this.cartes_main = Cartes_main;
        for (int i = 2;i<cartes_main.size(); i++){
            if(cartes_main.get(i-2).getIntValue().equals(cartes_main.get(i-1).getIntValue())  && cartes_main.get(i-1).getIntValue().equals(cartes_main.get(i).getIntValue()) ){
                carteBrelon = cartes_main.get(i);
            }
        }

    }

    public boolean isBrelon(){
        return carteBrelon != null;
    }

    public Carte getCarteBrelon() {
        return carteBrelon;
    }

    public String toString(){
        return carteBrelon.toString();
    }
}
