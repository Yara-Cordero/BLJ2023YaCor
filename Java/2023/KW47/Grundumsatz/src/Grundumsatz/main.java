package Grundumsatz;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

    private static double femaleCalc (int weight, int height, int age ) {
        return 655.1 + 9.6 * weight + 1.8 * height - 4.7 * age;
    }

    private static double maleCalc (int weight, int height, int age) {
        return 66.47 + 13.7 * weight + 5 * height - 6.8 * age;
    }
    private static void slowPrint(String output) {
        for(int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try{
                TimeUnit.MILLISECONDS.sleep(30);
            }
            catch (Exception e){

            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the metabolism calculator");

        System.out.println("Do you want to calculate female, male or both?");
        String gender = scan.nextLine().toLowerCase();

        switch (gender){
            case "female":
                System.out.println("What is your age? ");
                int age = scan.nextInt();

                System.out.println("How much do you weigh? ");
                int weight = scan.nextInt();

                System.out.println("How tall are you? (cm)");
                int height = scan.nextInt();

                System.out.println("\nfemale:  " + femaleCalc(weight, height, age) + " calories per day");

                break;
            case "male":
                System.out.println("What is your age? ");
                age = scan.nextInt();

                System.out.println("How much do you weigh? ");
                weight = scan.nextInt();

                System.out.println("How tall are you? (cm)");
                height = scan.nextInt();

                System.out.println("\nmale:  " + maleCalc(weight, height, age) + " calories per day");
                break;
            case "both":
                System.out.println("What is your age? (female) ");
                age = scan.nextInt();

                System.out.println("What is your age? (male)");
                int ageM = scan.nextInt();

                System.out.println("How much do you weigh? (female) ");
                weight = scan.nextInt();

                System.out.println("How much do you weigh? (male)");
                int weightM = scan.nextInt();

                System.out.println("How tall are you? (cm) (female)");
                height = scan.nextInt();

                System.out.println("How tall are you? (cm) (male)");
                int heightM = scan.nextInt();

                System.out.println("\nfemale:  " + femaleCalc(weight, height, age) + " calories per day");
                System.out.println("male:  " + maleCalc(weightM, heightM, ageM) + " calories per day");


                scan.close();
                break;
            default:
                slowPrint("You may not enter anything...");
        }
    }
}
