package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import poker.Carte;

public class InputReader {

    private final ArrayList<Carte> main_joueur;
    private final int NB_CARTE_MAIN = 5;

    public InputReader(){
        Scanner carteInput = new Scanner(System.in);

        String c1 = carteInput.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(c1.split(" ")));
        if(list.size() != NB_CARTE_MAIN){
            System.out.println("Nombre de cartes incorrect\n");
            System.exit(-1);
        }

        ArrayList<Carte> carteList = new ArrayList<>();

        for (String carte : list) {
            if(toInt(carte) >=2 && toInt(carte) <= 14){
                carteList.add(new Carte(carte));
            }else{
                System.out.println("Format d'une des carte incorrect");
                System.exit(-1);
            }
        }
        main_joueur = carteList;
    }

    public InputReader(String s){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        if(list.size() != NB_CARTE_MAIN){
            System.out.println("Nombre de cartes incorrect\n");
            System.exit(-1);
        }

        ArrayList<Carte> carteList = new ArrayList<>();

        for (String carte : list) {
            if(toInt(carte) >=2 && toInt(carte) <= 14){
                carteList.add(new Carte(carte));
            }else{
                System.out.println("Format d'une des carte incorrect");
                System.exit(-1);
            }
        }
        main_joueur = carteList;
    }

    /**
     *
     * @return
     */
    public ArrayList<Carte> getMain_joueur(){
        return main_joueur;
    }

    /**
     *
     * @param carteToInt
     * @return
     */
    public int toInt(String carteToInt) {
        try {
            return Integer.parseInt(carteToInt);
        } catch (NumberFormatException e) {
            return switch (carteToInt) {
                case "V" -> 11;
                case "D" -> 12;
                case "R" -> 13;
                case "A" -> 14;
                default -> 0;
            };

        }
    }




}