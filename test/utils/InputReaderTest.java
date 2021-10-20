package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poker.Carte;

import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {
    String stdin;
    InputStream stringStream;
    ArrayList<Carte> mainJoueurTest = new ArrayList<>();
    InputReader input1;


    @BeforeEach
    void setUp() {
        stdin = "5 5 5 6 7";
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("5"));
        mainJoueurTest.add(new Carte("6"));
        mainJoueurTest.add(new Carte("7"));
        input1 = new InputReader(stdin);
    }

    @Test
    void getMain_joueur() {
        assertEquals(input1.getMain_joueur().toString(),mainJoueurTest.toString());
    }

    @Test
    void toInt() {

    }
}