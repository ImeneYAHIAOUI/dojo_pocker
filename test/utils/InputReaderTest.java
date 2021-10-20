package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {
    String stdin;
    InputStream stringStream;
    

    @BeforeEach
    void setUp() {
        stdin = "5 5 5 6 7";
        stringStream = new java.io.ByteArrayInputStream(stdin.getBytes());
    }

    @Test
    void getMain_joueur() {

    }

    @Test
    void toInt() {
    }
}