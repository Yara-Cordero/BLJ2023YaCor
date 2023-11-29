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
        System.out.println(cyan +
                "\n\n       /$$$$$$                                          /$$                        \n" +
                "      /$$__  $$                                        |__/                        \n" +
                "     | $$  \\ $$  /$$$$$$  /$$   /$$  /$$$$$$   /$$$$$$  /$$ /$$   /$$ /$$$$$$/$$$$ \n" +
                "     | $$$$$$$$ /$$__  $$| $$  | $$ |____  $$ /$$__  $$| $$| $$  | $$| $$_  $$_  $$\n" +
                "     | $$__  $$| $$  \\ $$| $$  | $$  /$$$$$$$| $$  \\__/| $$| $$  | $$| $$ \\ $$ \\ $$\n" +
                "     | $$  | $$| $$  | $$| $$  | $$ /$$__  $$| $$      | $$| $$  | $$| $$ | $$ | $$\n" +
                "     | $$  | $$|  $$$$$$$|  $$$$$$/|  $$$$$$$| $$      | $$|  $$$$$$/| $$ | $$ | $$\n" +
                "     |__/  |__/ \\____  $$ \\______/  \\_______/|__/      |__/ \\______/ |__/ |__/ |__/\n" +
                "                     | $$                                                          \n" + blue +
                "        __________ " + cyan + "  | $$                                                               \n" + blue +
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

        while (!validInput) {
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

    private static String choices() {
        boolean validInput = false;
        String choiceInput = null;

        System.out.println("\nYou now have the options to:\n");
        System.out.println("1. add Fish");
        System.out.println("2. delete Fish");
        System.out.println("3. add deco");
        System.out.println("4. delete deco");

        while (!validInput) {
            System.out.println("\nWhat do you want to do?");
            choiceInput = scan.nextLine().toLowerCase();

            switch (choiceInput) {
                case "1", "1.", "add fish", "2", "2.", "delete fish", "3", "3.", "add deco", "4", "4.", "delete deco":
                    validInput = true;
                    break;
                default:
                    System.out.println("Please enter a valid Input!!\n");
            }
        }
        return choiceInput;
    }

    //First make that all functions
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choiceRepeatInputAll = "yes";

        printLogo();
        boolean waterChoice = askWaterType();
        int width = askWidth();
        int length = askLength();

        Aquarium myAquarium = new Aquarium(width, length, waterChoice);


        Deco algae = new Deco("Coral", true);
        Deco coral = new Deco("Algae", false);

        Fish clownfish = new Fish("Clownfish", 1, true, "orange");
        Fish redSnapper = new Fish("Red Snapper", 1, true, "red");
        Fish dottyback = new Fish("Dotty-back", 1, true, "purple/yellow");

        Fish tilapia = new Fish("Tilapia", 2, false, "brownish");
        Fish largemouthBass = new Fish("Largemouth Bass", 2, false, "green");
        Fish trout = new Fish("Trout", 2, false, "white/pink/orange");


        myAquarium.printAquarium();

        do {
            String choiceAnswer = choices();

            if (choiceAnswer.equals("1") || choiceAnswer.equals("1.") || choiceAnswer.equals("add fish")) {
                String choiceRepeatInput = "yes";

                while (choiceRepeatInput.equals("yes")) {
                    boolean repeat = false;

                    System.out.println("Where should the fish be added?\nEnter X / Y");
                    int xPos = scan.nextInt();
                    int yPos = scan.nextInt();

                    do {
                        System.out.println("\n1. Clownfish\n2. Red Snapper\n3. Dotty-back\n4. Tilapia\n5. Largemouth Bass\n6. Trout\n");
                        System.out.println("What fish do you want to add to the aquarium?");
                        String fishChoice = scan.next().toLowerCase();

                        switch (fishChoice) {
                            case "1", "1.", "clownfish":
                                myAquarium.addFish(clownfish, xPos, yPos);
                                break;
                            case "2", "2.", "red snapper":
                                myAquarium.addFish(redSnapper, xPos, yPos);
                                break;
                            case "3", "3.", "dotty-back", "dottyback":
                                myAquarium.addFish(dottyback, xPos, yPos);
                                break;
                            case "4", "4.", "tilapia":
                                myAquarium.addFish(tilapia, xPos, yPos);
                                break;
                            case "5", "5.", "largemouth bass", "largemouthbass":
                                myAquarium.addFish(largemouthBass, xPos, yPos);
                                break;
                            case "6", "6.", "trout":
                                myAquarium.addFish(trout, xPos, yPos);
                                break;
                            default:
                                System.out.println("Enter a valid fish type");
                        }

                        System.out.println("Where you able to add a fish? (0/1)");
                        int wasAdded = scan.nextInt();
                        if (wasAdded == 0) {
                            repeat = true;
                        } else {
                            repeat = false;
                        }
                    } while (!repeat);

                    System.out.println("Do you want to continue adding fish to you aquarium?");
                    System.out.println("Enter 'yes' or 'no'");
                    choiceRepeatInput = scan.nextLine().toLowerCase();

                }
            } else if (choiceAnswer.equals("2") || choiceAnswer.equals("2.") || choiceAnswer.equals("delete fish")) {
                String choiceRepeatInput = "yes";

                while (choiceRepeatInput.equals("yes")) {

                    System.out.println("What fish do you want to delete?\nEnter X / Y");
                    int xPos = scan.nextInt();
                    int yPos = scan.nextInt();

                    myAquarium.deleteFishPerPosition(xPos, yPos);

                    System.out.println("Do you want to continue deleting fish in your aquarium?");
                    System.out.println("Enter 'yes' or 'no'");
                    choiceRepeatInput = scan.nextLine().toLowerCase();

                }
            } else if (choiceAnswer.equals("3") || choiceAnswer.equals("3.") || choiceAnswer.equals("add deco")) {
                String choiceRepeatInput = "yes";

                do {
                    System.out.println("Where should the deco be added?\nEnter X / Y");
                    int xPos = scan.nextInt();
                    int yPos = scan.nextInt();


                    System.out.println("\n1. Coral\n2. Algae\n");
                    System.out.println("What deco do you want to add to the aquarium?");
                    String decoChoice = scan.next().toLowerCase();

                    switch (decoChoice) {
                        case "1", "1.", "coral":
                            myAquarium.addDeco(coral, xPos, yPos);
                            break;
                        case "2", "2.", "algae":
                            myAquarium.addDeco(algae, xPos, yPos);
                            break;
                        default:
                            System.out.println("Enter a valid deco type");
                    }

                    System.out.println("Do you want to continue adding deco to you aquarium?");
                    System.out.println("Enter 'yes' or 'no'");
                    choiceRepeatInput = scan.next().toLowerCase();

                } while (choiceRepeatInput.equals("yes"));
            } else {
                String choiceRepeatInput = "yes";

                while (choiceRepeatInput.equals("yes")) {

                    System.out.println("What deco do you want to delete?\nEnter X / Y");
                    int xPos = scan.nextInt();
                    int yPos = scan.nextInt();

                    myAquarium.deleteDecoPerPosition(xPos, yPos);

                    System.out.println("Do you want to continue deleting deco in your aquarium?");
                    System.out.println("Enter 'yes' or 'no'");
                    choiceRepeatInput = scan.nextLine().toLowerCase();
                }
            }
            myAquarium.printAquarium();

            System.out.println("Do you want to do something else?");
            choiceRepeatInputAll = scan.next().toLowerCase();

        } while (choiceRepeatInputAll.equals("yes"));

        //System.out.println("Do you want to know more ");
    }
}

