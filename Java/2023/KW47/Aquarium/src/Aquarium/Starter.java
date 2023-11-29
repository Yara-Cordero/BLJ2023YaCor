package Aquarium;
import java.util.Scanner;
//Beinhaltet
//main(); (Verwaltung)
public class Starter {
    static Scanner scan = new Scanner(System.in);
    private static final String cyan = "\u001B[36m";
    private static final String reset = "\u001B[0m";
    private static final String blue = "\u001B[34m";

    private static void printLogo() {
        System.out.println( cyan +
                "\n\n       /$$$$$$                                          /$$                        \n" +
                "      /$$__  $$                                        |__/                        \n" +
                "     | $$  \\ $$  /$$$$$$  /$$   /$$  /$$$$$$   /$$$$$$  /$$ /$$   /$$ /$$$$$$/$$$$ \n" +
                "     | $$$$$$$$ /$$__  $$| $$  | $$ |____  $$ /$$__  $$| $$| $$  | $$| $$_  $$_  $$\n" +
                "     | $$__  $$| $$  \\ $$| $$  | $$  /$$$$$$$| $$  \\__/| $$| $$  | $$| $$ \\ $$ \\ $$\n" +
                "     | $$  | $$| $$  | $$| $$  | $$ /$$__  $$| $$      | $$| $$  | $$| $$ | $$ | $$\n" +
                "     | $$  | $$|  $$$$$$$|  $$$$$$/|  $$$$$$$| $$      | $$|  $$$$$$/| $$ | $$ | $$\n" +
                "     |__/  |__/ \\____  $$ \\______/  \\_______/|__/      |__/ \\______/ |__/ |__/ |__/\n" +
                "                     | $$                                                          \n" + blue +
                "        __________ " + cyan +"  | $$                                                               \n" + blue +
                "       /          \\" + cyan + "  |__/" + blue + "                                        (\n" + blue +
                "      /____________\\                                           (\\)\n" +
                "       |:_:_:_:_:_|                                             ))\n" +
                "       |_:_,--.:_:|                                          (\\//   )\n" +
                "       |:_:|__|_:_|                         _               ) ))   ((\n" +
                "    _  |_   _  :_:|   _   _   _            (_)             ((((   /)\\`\n" +
                "   | |_| |_| |   _|  | |_| |_| |             o              \\\\)) (( (\n" +
                "    \\_:_:_:_:/|_|_|_|\\:_:_:_:_/             .                ((   ))))\n" +
                "     |_,-._:_:_:_:_:_:_:_.-,_|                                )) ((//\n" +
                "     |:|_|:_:_:,---,:_:_:|_|:|                               ,-.  )/\n" +
                "     |_:_:_:_,'     `,_:_:_:_|           _  o               ,;'))((\n" +
                "     |:_:_:_/  _ | _  \\_:_:_:|          (_O                   ((  ))\n" +
                "_____|_:_:_|  (o)-(o)  |_:_:_|--'`-.     ,--.                (((\\'/\n" +
                " ', ;|:_:_:| -( .-. )- |:_:_:| ', ; `--._\\  /,---.~           \\`))\n" +
                ".  ` |_:_:_|   \\`-'/   |_:_:_|.  ` .  `  /()\\.__( ) .,-----'`-\\((\n" +
                " ', ;|:_:_:|    `-'    |:_:_:| ', ; ', ; `--'|   \\ ', ; ', ; ',')).,--\n" +
                ".  ` ` . ` .  ` .  ` .  ` .  ` .  ` .  ` .    .  ` .  ` .  ` .  ` .  `\n" +
                " ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ; ', ;\n" + blue +
                "     .-.     .-.     .-.     .-.     .-.     .-.     .-.     .-.     .\n" +
                "`._.'   `._.'   `._.'   `._.'   `._.'   `._.'   `._.'   `._.'   `._.' \n\n" + reset);
    }

    private static boolean askWaterType() {
        boolean validInput = false;
        boolean waterChoice = false;

        while(!validInput) {
            System.out.println("Do you want your Tank to contain Saltwater or Freshwater?");
            String waterInput = scan.nextLine().toLowerCase();

            switch (waterInput) {
                case "saltwater":
                    waterChoice = true;
                    validInput = true;
                    break;
                case "freshwater":
                    validInput = true;
                    break;
                default:
                    System.out.println("Please enter Saltwater or Freshwater!\n");
                    break;
            }
        }
        return waterChoice;
    }

    private static int askWidth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What will the width of your tank be?");
        return scan.nextInt();
    }

    private static int askLength() {
        Scanner scan = new Scanner(System.in);
        System.out.println("And the length?");
        return scan.nextInt();
    }

    private static String choices () {
        System.out.println("\nYou now have the options to:\n");ndjfnsjf++
    }

//First make that all functions
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printLogo();
        boolean waterChoice = askWaterType();
        int width = askWidth();
        int length = askLength();

        Aquarium myAquarium = new Aquarium(width, length, waterChoice);

        myAquarium.printAquarium();

        Deco coral = new Deco("Coral", true);
        Deco algae = new Deco("Algae", false);








        /*
        Fish nemo = new Fish("nemo", 2, true, "orange", true);
        Fish bob = new Fish("bob", 1, false, "blue", true);

        Aquarium mySaltWaterAquarium = new Aquarium(width, length , true);
        mySaltWaterAquarium.printAquarium();
        mySaltWaterAquarium.addFish(nemo, 5, 5);
        mySaltWaterAquarium.printAquarium();

        Deco coral = new Deco("Corals", true);

        mySaltWaterAquarium.addDeco(coral, 3, 5);

        mySaltWaterAquarium.printAquarium();

        mySaltWaterAquarium.deleteDecoPerPosition(3, 5);

        mySaltWaterAquarium.addFish(bob, 7, 2);

        mySaltWaterAquarium.printAquarium();
        */

    }
}
