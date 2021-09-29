import java.util.Scanner;

public class InputReader {

    private String main_joueur;

    public InputReader(){
        Scanner carteInput = new Scanner(System.in);
        String carte = carteInput.nextLine();

        if(toInt(carte) >=1 && toInt(carte) <= 13){
            main_joueur = carte;
        }else{
            System.out.println("ERREUR !!!!!!!!!!!");
            System.exit(-1);
        }
    }

    public int toInt(String carteToInt){
        return Integer.parseInt(carteToInt);
    }

    public String toString(){
        return main_joueur;
    }


}
