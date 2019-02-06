package dumaya.dev;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PartieTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Partie partie = new Partie();

    @Test
    public void choixduJeu() {
        System.setIn(new ByteArrayInputStream("C\nR\n".getBytes()));
        System.setOut(new PrintStream(outContent));
        partie.choixduJeu();
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals(output.endsWith("C'est parti pour : Jeu : C Mode : R\n"),true);
    }

    @Test
    public void initLog() {
    }

    @Test
    public void chercherConfig() {
    }

    @Test
    public void lancerJeu() {
    }
}