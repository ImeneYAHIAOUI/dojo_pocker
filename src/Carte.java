public class Carte {


    /*
     * Juste pour la carte soit un objet et renvoie sa valeur sous forme de string
     * */
    private final String value;

    public Carte(String value){
        this.value = value;
    }

    public String toString(){
        return this.value;
    }


    public Integer getIntValue(){
        try {
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            return switch (value) {
                case "V" -> 11;
                case "D" -> 12;
                case "R" -> 13;
                default -> 14;
            };

        }

    }
    public boolean sameValue(Carte carte){
        return this.getIntValue() == carte.getIntValue();
    }
}
