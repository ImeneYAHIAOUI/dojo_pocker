public class Carte {


    /*
     * Juste pour la carte soit un objet et renvoie sa valeur sous forme de string
     * */
    private String value;
    protected Integer intValue;

    /**
     *
     * @param value
     */
    public Carte(String value) {
        this.value = value;
        try {
            intValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            switch (value) {
                case "V":
                    intValue = 11;
                    break;

                case "D":
                    intValue = 12;
                    break;

                case "R":
                    intValue = 13;
                    break;
                default:
                    intValue = 14;
                    break;
            }
            ;

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
     * @return
     */
    public Integer getIntValue() {
        return intValue;
    }

    /**
     *
     * @param carte
     * @return
     */
    public boolean sameValue(Carte carte){
        return this.intValue == carte.intValue;
    }
}
