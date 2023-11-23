package Grundumsatz;

public class Stoffwechselrate {

    private static double femaleCalc (int weight, int height, int age ) {
        return 655.1 + 9.6 * weight + 1.8 * height - 4.7 * age;
    }

    private static double maleCalc (int weight, int height, int age) {
        return 66.47 + 13.7 * weight + 5 * height - 6.8 * age;
    }
}
