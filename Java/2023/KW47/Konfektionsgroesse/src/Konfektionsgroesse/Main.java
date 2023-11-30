package Konfektionsgroesse;

import java.util.Scanner;
public class Main {

    private static int computeGarmentSize(int height, String gender, int chestCircumference) {

        if(gender.equals("female")) {
            if (height >= 164 && height <= 170) {
                return  (chestCircumference / 2) - 6;
            }
            else if(height < 164) {
                return  ((chestCircumference / 2 ) - 6) / 2;
            }
            else if (height > 170) {
                return ((chestCircumference / 2 ) - 6) * 2;
            }
        }
        else if (gender.equals("male")) {
            return chestCircumference / 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the confection calculator!");
        System.out.println("Let's see what size capitalism has given you!!! ");

        System.out.println();
        System.out.println("What gender are you? ");
        String gender = scan.nextLine().toLowerCase();

        System.out.println("How tall are you? (cm) ");
        int height = scan.nextInt();

        System.out.println("What is your chest circumference? (cm)");
        int chestCircumference = scan.nextInt();

        int size = computeGarmentSize(height, gender, chestCircumference);
        System.out.println("Your confection size is: " + size );
    }
}