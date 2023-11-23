package ChristmasTree;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    public static final String reset = "\u001B[0m";
    public static final String black = "\u001B[30m"; //use
    public static final String yellow = "\u001B[33m";
    public static final String green = "\u001B[32m";
    public static final String red = "\u001B[31m";

    private static void slowPrint(String output) {
        for(int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try{
                TimeUnit.MILLISECONDS.sleep(20);
            }
            catch (Exception e){

            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean star = false;


        slowPrint("Enter the width of the tree: ");
        int width = scan.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i - 1; j++) {
                System.out.print(" ");
            }
            if (star == false) {
                System.out.print(yellow + "*" + reset);
                star = true;
            } else {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print(green + "*" + reset);
                    } else {
                        System.out.print(red + "*" + reset);
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < width - 2 ; j++) {
                System.out.print(" ");
            }
            System.out.println("##");
        }
    }
}