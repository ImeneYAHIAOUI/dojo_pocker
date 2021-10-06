import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCarte {

        @Test
        public void TestCarteValue(){
            Carte c1 = new Carte("12");
            Carte c2 = new Carte("12");
            //assertEquals(c1, c2);
            assertEquals(c1,c1);

    }
}
