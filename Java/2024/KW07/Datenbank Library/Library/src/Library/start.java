package Library;

import java.util.Scanner;

public class start {


    private static final String red = "\u001B[31m";
    private static final String blue = "\u001B[34m";
    private static final String green ="\u001B[32m";
    private static final String reset = "\u001B[0m";
    private static final Scanner scan = new Scanner(System.in);



    public void start() {


        boolean error;
        do {
            System.out.println("Do you want to " + blue + "Login " + reset + "or " + green + "Signup?");
            String startChoice = scan.nextLine().toLowerCase();

            switch (startChoice) {
                case "login":


                    error = false;
                    break;
                case "signup":


                    error = false;
                    break;
                default: {
                    System.out.println(red + "Invalid input" + reset);
                    error = true;
                }
            }
        }while (error);



    }
}
