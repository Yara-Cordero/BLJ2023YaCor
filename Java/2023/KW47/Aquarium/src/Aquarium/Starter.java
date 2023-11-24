package Aquarium;
import java.util.Scanner;
//Beinhaltet
//main(); (Verwaltung)
public class Starter {

    private static final String cyan = "\u001B[36m";
    private static final String reset = "\u001B[0m";
    private static final String blue = "\u001B[34m";

    private static void printLogo() {
        System.out.println("               O  o\n" +
                "          _\\_   o\n" +
                ">('>   \\\\/  o\\ .\n" +
                "       //\\___=\n" +
                "          ''\n" + cyan + "  /$$$$$$                                          /$$                        \n" +
                " /$$__  $$                                        |__/                        \n" +
                "| $$  \\ $$  /$$$$$$  /$$   /$$  /$$$$$$   /$$$$$$  /$$ /$$   /$$ /$$$$$$/$$$$ \n" +
                "| $$$$$$$$ /$$__  $$| $$  | $$ |____  $$ /$$__  $$| $$| $$  | $$| $$_  $$_  $$\n" +
                "| $$__  $$| $$  \\ $$| $$  | $$  /$$$$$$$| $$  \\__/| $$| $$  | $$| $$ \\ $$ \\ $$\n" +
                "| $$  | $$| $$  | $$| $$  | $$ /$$__  $$| $$      | $$| $$  | $$| $$ | $$ | $$\n" +
                "| $$  | $$|  $$$$$$$|  $$$$$$/|  $$$$$$$| $$      | $$|  $$$$$$/| $$ | $$ | $$\n" +
                "|__/  |__/ \\____  $$ \\______/  \\_______/|__/      |__/ \\______/ |__/ |__/ |__/\n" +
                "                | $$                                                          \n" +
                "                | $$                                                          \n" +
                "                |__/                                                          " + reset);
    }
//First make that all functions
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printLogo();

        System.out.println("What width and length do you want the aquarium to be? ");
        int width = scan.nextInt();
        int length = scan.nextInt();

        Fish nemo = new Fish("nemo", 2, true, "orange", true);
        Fish bob = new Fish("bob", 1, false, "blue", true);

        Aquarium mySaltWaterAquarium = new Aquarium(width, length , true);
        mySaltWaterAquarium.printAquarium();
        mySaltWaterAquarium.addFish(nemo, 5, 5);
        mySaltWaterAquarium.printAquarium();

        mySaltWaterAquarium.deleteFishPerName(nemo);

        mySaltWaterAquarium.printAquarium();

        mySaltWaterAquarium.addFish(bob, 7, 2);

        mySaltWaterAquarium.printAquarium();

    }
}
