import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputReader {

    private ArrayList<Carte> main_joueur;
    private final int NB_CARTE_MAIN = 2;

    public InputReader(){
        Scanner carteInput = new Scanner(System.in);

        String c1 = carteInput.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(c1.split(" ")));
        if(list.size() != NB_CARTE_MAIN){
            System.out.println("Nombre de cartes incorrect\n");
            System.exit(-1);
            /*String reponse = carteInput.next();
            if (reponse.equals("o")){
                new InputReader();
            }else {
                System.exit(-1);
            }*/
        }

        ArrayList<Carte> carteList = new ArrayList<>();

        for (String carte : list) {
            if(toInt(carte) >=1 && toInt(carte) <= 13){
                carteList.add(new Carte(carte));
            }else{
                System.out.println("Format d'une des carte incorrect");
                System.exit(-1);
                /*String reponse = carteInput.next();
                if (reponse.equals("o")){
                    new InputReader();
                }else {
                    System.exit(-1);
                }*/
            }
        }
        main_joueur = carteList;




    }
    public ArrayList<Carte> getMain_joueur(){
        return main_joueur;
    }
    public int toInt(String carteToInt){
        return Integer.parseInt(carteToInt);
    }




}
