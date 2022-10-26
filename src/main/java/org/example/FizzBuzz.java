package org.example;

public class FizzBuzz {
    public static String fizzBuzz(int number) {

        // 1. Fall
        // Andere Möglichkeit eine Zahl einen String zu konventieren
        // Datentypen konvertieren = "Casten"
        // String s = "" * number

        if (number % 4 == 0) {
            return "fizz";
        }
        return String.valueOf(number);

    }
}
