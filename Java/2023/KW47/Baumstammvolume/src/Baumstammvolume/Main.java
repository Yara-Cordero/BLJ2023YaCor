package Baumstammvolume;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    private static float volumeCalc(float length, float diameter) {
        return (float) (Math.PI / 4 * (diameter * diameter) *  length / 10000);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the volume calculator!");

        System.out.println("Enter the length: ");
        float length = scan.nextFloat();

        System.out.println("Enter the diameter: ");
        float diameter = scan.nextFloat();

        System.out.println("The volume is " + volumeCalc(length, diameter) + "cm²");




    }
}