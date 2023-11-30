package AnalogerUhrzeiger;

import java.util.Scanner;

public class Main {

    private static float computeHourHandAngle (float H, float M) {
        return (float) (0.5 * (60 * H + M));
    }

    private static float computeMinuteHandAngle (float M) {
        return (float) 6 * M;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Hours in Analog:");
        float H = scan.nextFloat();

        System.out.println("Enter the Minutes in Analog:");
        float M = scan.nextFloat();

        System.out.println("The hour handle is at " + computeHourHandAngle(H, M) + "°");
        System.out.println("The minute handle is at " + computeMinuteHandAngle(M) + "°");

    }
}