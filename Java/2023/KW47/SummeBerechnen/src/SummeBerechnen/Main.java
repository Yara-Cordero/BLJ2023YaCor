package SummeBerechnen;

import java.util.Scanner;

public class Main {

    private static int sumCalculator(int firstDigit, int secondDigit) {
        int start = firstDigit;
        int end = secondDigit;
        int result = 0;

        for (int i = start; i < end; i++) {
            result += i;
        }
        return result + end;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the sum calculator!");

        System.out.println("Enter the first number: ");
        int firstDigit = scan.nextInt();

        System.out.println("Enter the second number: ");
        int secondDigit = scan.nextInt();

        System.out.println("The sum of all the nums " + firstDigit + " through " + secondDigit + " : "+ sumCalculator(firstDigit, secondDigit));


    }
}