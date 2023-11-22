package PersonenManager;
import java.util.Scanner;
public class Main {
    Scanner scan = new Scanner(System.in);

    private static final int GROUP_SIZE = 4;
    private static Person[] myGroup = new Person[GROUP_SIZE];


    private static void inputPerson(int i) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String firstname = scan.nextLine();

        System.out.println("What is your lastname? ");
        String lastname = scan.nextLine();

        System.out.println("What year were you born? ");
        int birthyear = scan.nextInt();

        System.out.println("How tall are you? ");
        System.out.println("(Please write in cm)");
        int height = scan.nextInt();

        System.out.println("For what firm do  ");
        String firm = scan.nextLine();




    }

    public static void main(String[] args) {


    }




}


