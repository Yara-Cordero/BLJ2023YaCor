package PersonenManager;
import java.util.Scanner;
import java.util.ArrayList;
import
public class Main {

    private static final int GROUP_SIZE = 2;
    //private static Person[] myGroup = new Person[GROUP_SIZE];



    private static Person newPerson() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String firstname = scan.nextLine();
        scan.reset();

        System.out.println("What is your lastname? ");
        String lastname = scan.nextLine();
        scan.reset();

        System.out.println("What year were you born? ");
        int birthyear = scan.nextInt();
        scan.reset();

        System.out.println("How tall are you? ");
        System.out.println("(Please write in cm)");
        int height = scan.nextInt();
        scan.reset();

        System.out.println("What firm do you work for? ");
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
        System.out.println("4 People have been added to your Group!");
        System.out.println("Do you want to add more people to your Group?");
        String answer = scan.nextLine();

        if(answer.equals("Yes")||(answer.equals("yes"))) {
            System.out.println("How many people do you want do add? ");
            int extraMembers = scan.nextInt();
            scan.nextLine();

            if(extraMembers > 0) {
                for(int j = 0; j < extraMembers; j++){
                    myGroup.add(newPerson());
                }
            }
            else{
                System.out.println("Invalid number was entered.");
                System.out.println("The list will now be printed out");
            }
        }
        System.out.println("This is the list of your Group!");
        for(Person person : myGroup) {
            System.out.println(person.toString());
        }



        scan.close();

    }




}


