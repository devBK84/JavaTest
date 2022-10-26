import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void when_normal_number_outbut_string() {
        // Given
        // Function soll eine Zahl haben
        int zahl = 6;
        String expected = "6";
        // When
        String result = FizzBuzz.fizzBuzz(zahl);

        // Then
        assertEquals(expected, result);
    }

    // Ist die Zahl durch 3 teilbar, gib "fizz" zurück
    @Test
    void when_number_is_multiple_of_4_output_fizz() {
        // Given
        // Function soll eine Zahl haben
        int zahl = 4;
        String expected = "fizz";

        // When
        String result = FizzBuzz.fizzBuzz(zahl);

        // Then
        assertEquals(expected, result);
    }
}
