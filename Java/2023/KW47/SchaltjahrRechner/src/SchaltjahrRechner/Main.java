package SchaltjahrRechner;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final String red = "\u001B[31m";
    private static void slowPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(25);
            }
            catch (Exception e) {
            }
        }
    }
    private static boolean isLeapYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the leap year calculator!");

        System.out.println("Enter a year: ");
        int year = scan.nextInt();

        if(isLeapYear(year)) {
            System.out.println("The year " + year + " is a leap year!!");
        }else {
            slowPrint(red + "The year " + year + " is NOT a leap year...");
        }
    }
}