package org.example;


import org.junit.Test;

public class FizzBuzzTest {

    @Test
    void when_normal_number_outbut_string() {
        // Given
        // Function soll eine Zahl haben
        int zahl = 4;
        String expected = "";
        String expected = "4"

        // When
        String result = FizzBuzzTest(zahl);

        // Then
        assertEquals(expected, result);
    }

    // Ist die Zahl durch 3 teilbar, gib "fizz" zurück
    @Test
    void when_number_is_multiple_of_of_3_output_fizz() {
        // Given
        // Function soll eine Zahl haben
        int zahl = 6;
        String expected = "";
        String expected = "4"

        // When
        String result = FizzBuzzTest(zahl);

        // Then
        assertEquals(expected, result);
    }
}
