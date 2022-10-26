import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {
        
    }
//"@Test" = Annotation = Testmethode, d.h. sie testet eine Methode
    @Test
    void sum_should_return_correct_result() {
        // Given - Das was wir am Anfang haben
        int zahl1 = 5;
        int zahl2 = 7;
        int expected = zahl1 + zahl2; // 12
        // When - Das was wir testen  wollen, rufen wir hier auf
        int result = sum(zahl1, zahl2);
        // Then - Das Ergebis das wir erwarten
        // Assertions = Sicherstellung helfen uns Ergbnisse sicherstellen
        assertEquals(expected, result);

    }

    private int sum(int zahl1, int zahl2) {
        return 0;
    }

    @Test
    void sum_should_not_incorrect_result() {
        // Given - Das was wir am Anfang haben
        int zahl1 = 5;
        int zahl2 = 7;
    int expected = 13; // Ähmm Computer sagt nein! (falsches Ergebnis)
        // When - Das was wir testen  wollen, rufen wir hier auf
        int result = sum(zahl1, zahl2);
        // Then - Das Ergebis das wir erwarten
        // Assertions = Sicherstellung helfen uns Ergbnisse sicherstellen

        assertNotEquals(expected, result);

    }

}