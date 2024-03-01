package CatQuote;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static boolean isRunning;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ZenQuote Quote = new ZenQuote();
        Cataas Cat = new Cataas();

        boolean error;

        do {
            Quote.getQuote();
            Cat.getCat();

            do {
                System.out.println("\n<m> more Quotes");
                System.out.println("<q> quit");

                String answer = scan.nextLine().toLowerCase().trim().replaceAll("\\s+", " ");

                if(answer.equals("m")){
                    isRunning = true;
                    error = false;
                } else if (answer.equals("q")) {
                    isRunning = false;
                    error = false;
                } else {
                    error = true;
                }
            }while (error);
        }while (isRunning);
    }
}
