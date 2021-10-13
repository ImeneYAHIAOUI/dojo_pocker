import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {
    private Carte carte1;
    private Carte carte2;
    private Carte carte3;

    @BeforeEach
    void setUp() {
        carte1 = new Carte("V");
        carte2 = new Carte("4");
        carte3 = new Carte("4");
    }

    @Test
    void testToString() {
        assertEquals(carte2.toString(),"4");
    }

    @Test
    void getIntValue() {
        assertEquals(carte1.getIntValue(),11);
    }

    @Test
    void sameValue() {
        assertEquals(carte1.sameValue(carte2),false);
        assertEquals(carte2.sameValue(carte3),true);
    }
}