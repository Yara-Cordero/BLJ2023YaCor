package CatQuote;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static boolean isRunning;
    private static final Scanner scan = new Scanner(System.in);

    private final static ZenQuote Quote = new ZenQuote();
    private final Cataas Cat = new Cataas();
    public static CataasWithText CataasWithText = new CataasWithText();


    public static void main(String[] args) throws IOException {


    }


    public void getImageAndQuote() throws IOException{
        boolean error;

        do {
            Quote.getQuote();
            Quote.getQuoteText();
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


/*        Quote.getQuote();


        CataasWithText.getCatWithText();

        String result = Quote.getQuoteText();

        System.out.println(result);
        */