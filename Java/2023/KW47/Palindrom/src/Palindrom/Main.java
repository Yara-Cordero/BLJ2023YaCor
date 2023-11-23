package Palindrom;
import java.util.Scanner;

public class Main {
    private static final String red = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's test if its a palindrome!");
        int number = scan.nextInt();

        int numberReversed = 0;
        int temp = number;

        while (temp > 0){
            int remainder = temp % 10;
            numberReversed = numberReversed * 10 + remainder;
            temp /= 10;
        }
        if(number == numberReversed) {
            System.out.println("It's a palindrome!");
        }else{
            System.out.println(red + "The number isn't a palindrome :(");
        }
        scan.close();
    }
}