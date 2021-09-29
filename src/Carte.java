public class Carte {


    /*
    * Juste pour la carte soit un objet et renvoie sa valeur sous forme de string
    * */
    private String value;

    public Carte(String value){
        this.value = value;
    }

    public String toString(){
        return this.value;
    }

    public Integer getIntValue(){
        return Integer.parseInt(this.value);
    }

}
