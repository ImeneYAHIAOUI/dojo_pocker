package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poker.Carte;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {
    String stdin1;
    String stdin2;
    String stdin3;
    String stdin4;
    String stdin5;

    ArrayList<Carte> mainJoueurTest = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest2 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest3 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest4 = new ArrayList<>();
    ArrayList<Carte> mainJoueurTest5 = new ArrayList<>();

    InputReader input1;
    InputReader input2;
    InputReader input3;
    InputReader input4;
    InputReader input5;


    @BeforeEach
    void setUp() throws PokerException {
        stdin1 = "5 5 5 6 7";
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("6"));
        mainJoueurTest.add(new Carte("7"));
        input1 = new InputReader(stdin1);

        stdin2 = "5 3 2 4";
        mainJoueurTest2.add(new Carte("5"));
        mainJoueurTest2.add(new Carte("3"));
        mainJoueurTest2.add(new Carte("2"));
        mainJoueurTest2.add(new Carte("4"));
        input2 = new InputReader(stdin2);

        stdin3 = "1 3 2 4 R";
        mainJoueurTest3.add(new Carte("1"));
        mainJoueurTest3.add(new Carte("3"));
        mainJoueurTest3.add(new Carte("2"));
        mainJoueurTest3.add(new Carte("4"));
        mainJoueurTest3.add(new Carte("R"));
        input3 = new InputReader(stdin3);

        stdin4 = "2 3 2 4 16";
        mainJoueurTest4.add(new Carte("2"));
        mainJoueurTest4.add(new Carte("3"));
        mainJoueurTest4.add(new Carte("2"));
        mainJoueurTest4.add(new Carte("4"));
        mainJoueurTest4.add(new Carte("16"));
        input4 = new InputReader(stdin4);

        stdin5 = "2 3 2 # 4";
        mainJoueurTest5.add(new Carte("2"));
        mainJoueurTest5.add(new Carte("3"));
        mainJoueurTest5.add(new Carte("2"));
        mainJoueurTest5.add(new Carte("#"));
        mainJoueurTest5.add(new Carte("4"));
        input5 = new InputReader(stdin5);


    }

    @Test
    void getMain_joueur() {

        assertEquals(input1.getMain_joueur().toString(),mainJoueurTest.toString());

        assertNull(input2.getMain_joueur());
        assertNull(input3.getMain_joueur());
        assertNull(input4.getMain_joueur());
        assertNull(input5.getMain_joueur());




    }

    @Test
    void toInt() {

        assertEquals(0, input1.toInt("0"));
        assertEquals(1, input1.toInt("1"));

        assertEquals(2, input1.toInt("2"));
        assertEquals(3, input1.toInt("3"));
        assertEquals(4, input1.toInt("4"));
        assertEquals(5, input1.toInt("5"));
        assertEquals(6, input1.toInt("6"));
        assertEquals(7, input1.toInt("7"));
        assertEquals(8, input1.toInt("8"));
        assertEquals(9, input1.toInt("9"));
        assertEquals(10, input1.toInt("10"));
        assertEquals(11, input1.toInt("V"));
        assertEquals(11, input1.toInt("11"));
        assertEquals(12, input1.toInt("D"));
        assertEquals(12, input1.toInt("12"));
        assertEquals(13, input1.toInt("R"));
        assertEquals(13, input1.toInt("13"));
        assertEquals(14, input1.toInt("A"));
        assertEquals(14, input1.toInt("14"));
        assertEquals(20, input1.toInt("20"));

        assertEquals(0, input1.toInt("N"));
        assertEquals(0, input1.toInt("K"));
        assertEquals(0, input1.toInt("hello"));

        assertEquals(0, input1.toInt("ç_#!"));

        assertNotEquals(15, input1.toInt("N"));
    }
}