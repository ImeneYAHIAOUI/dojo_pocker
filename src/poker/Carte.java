package poker;

public class Carte {


    /*
     * Juste pour la carte soit un objet et renvoie sa valeur sous forme de string
     * */
    private final String value;
    protected Integer intValue;

    /**
     *
     * @param value on reçoie de l'entrée standard des chaines de caracteres contenant les main
     *              donc on doit d'abord obtenir la valeur de la carte en int. On utlise le switch
     *              pour obtenir les valeurs de "V", "D", "R" et "A"
     */
    public Carte(String value) {
        this.value = value;
        try {
            intValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            switch (value) {
                case "V" -> intValue = 11;
                case "D" -> intValue = 12;
                case "R" -> intValue = 13;
                default -> intValue = 14;
            }
        }
    }

    /**
     *
     * @return
     */
    public String toString(){
        if(intValue < 11){
            return value;
        }
        return switch(intValue){
            case 11 -> "V";
            case 12 -> "D";
            case 13 -> "R";
            default -> "A";
        };
    }

    /**
     *
     * @return getter de la valeur int de la carte
     */
    public Integer getIntValue() {
        return intValue;
    }

    /**
     *
     * @param carte
     * @return cette méthode vérifie si deux cartes ont la meme valeur en comparant leurs valeurs int
     */
    public boolean sameValue(Carte carte){
        return this.intValue.equals(carte.intValue);
    }
}
