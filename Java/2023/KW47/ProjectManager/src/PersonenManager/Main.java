package PersonenManager;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class Main {

    private static final int GROUP_SIZE = 2;
    private static final String ANSI_GREEN = "\u001B[0m";
    private static final String ANSI_RESET = "\u001B[0m";


    public static void slowPrint(String output) {
        for(int i = 0; i < output.length(); i++){
            char c = output.charAt(i);
            System.out.print(ANSI_GREEN + c +ANSI_RESET);
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            }
            catch(Exception e) {

            }
        }
    }

    private static Person newPerson() {
        Scanner scan = new Scanner(System.in);

        slowPrint("What is your name? ");
        String firstname = scan.nextLine();
        scan.reset();

        slowPrint("What is your lastname? ");
        String lastname = scan.nextLine();
        scan.reset();

        slowPrint("What year were you born? ");
        int birthyear = scan.nextInt();
        scan.reset();

        slowPrint("How tall are you? ");
        slowPrint("(Please write in cm)");
        int height = scan.nextInt();
        scan.reset();

        slowPrint("What firm do you work for? ");
        String firm = scan.next();

        Person member = new Person(firstname, lastname, birthyear, height, firm);
        return member;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> myGroup = new ArrayList<>();

        for(int i = 0; i < GROUP_SIZE; i++) {
            myGroup.add(newPerson());
        }
        slowPrint("4 People have been added to your Group!");
        slowPrint("Do you want to add more people to your Group?");
        String answer = scan.nextLine();

        if(answer.equals("Yes")||(answer.equals("yes"))) {
            slowPrint("How many people do you want do add? ");
            int extraMembers = scan.nextInt();
            scan.nextLine();

            if(extraMembers > 0) {
                for(int j = 0; j < extraMembers; j++){
                    myGroup.add(newPerson());
                }
            }
            else {
                slowPrint("Invalid number was entered.");
                slowPrint("The list will now be printed out");
            }
        }
        slowPrint("This is the list of your Group!");
        for(Person person : myGroup) {
            slowPrint(person.toString());
        }

        scan.close();

    }




}


