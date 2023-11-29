package Aquarium;
import java.util.ArrayList;
import java.util.Arrays;


//Beinhaltet
//FOR ALL MAKE A SETTER AND GETTER

//2D-Array (int 0 = water 1 = fish 2 = floor 3 = deco) DONE
//boolean (is freshwater(true) or saltwater?(false)) DONE
//ArrayList -> Fish DONE
//ArrayList -> Deco
//add/remove fish function (fish) (either with name or position) DONE
//add/remove deco (name or position)
//get fish position (getter)
//print tank (void) DONE

public class Aquarium {
    private static final String reset = "\u001B[0m";
    private static final String blue = "\u001B[44m";
    private boolean isSaltWater; //if false = freshwater  if true = saltwater
    private int[][] aquarium;
    private int width;
    private int length;
    private ArrayList<Fish> fishes;

    private ArrayList<Deco> decos;


    public Aquarium() {
    }

    public Aquarium(int width, int length, boolean isSaltWater) {
        this.width = width;
        this.length = length;
        this.aquarium = new int[width][length];
        this.isSaltWater = isSaltWater;
        this.fishes = new ArrayList<>();
        this.decos = new ArrayList<>();

    }

    public void addFish(Fish fish, int xPos, int yPos) {
        if(isValidPosition(xPos, yPos)) {
            if ((fish.getSaltWater() && isSaltWater) || (!fish.getSaltWater() && !isSaltWater)) {
                fish.setXYPos(xPos, yPos);
                fishes.add(fish);
                aquarium[xPos][yPos] = fish.getSaltWater() ? 1 : 2;
                System.out.println("The new fish " + fish.getNameOfFish() + " has been added to your aquarium!!");
            }else {
                System.out.println("This fish requires a different type of water.");
            }
        } else {
            System.out.println("That fish will be out of bounds..");
        }
    }

    public void addDeco (Deco deco,int xPos, int yPos) {
        if(isValidPosition(xPos, yPos)) {
            deco.setXYPos(xPos, yPos);
            decos.add(deco);
            aquarium[xPos][yPos] = deco.getType() ? 4 : 3;
            System.out.println("A new decoration was added!!");
        } else {
            System.out.println("The deco will be out of bounds..");
        }
    }

    public void deleteFishPerName(Fish fish){
        this.fishes.remove(fish);
        this.aquarium[fish.getXPos()][fish.getYPos()] = 0; //turn place back to water
    }

    public void deleteDecoPerPosition(int xPos, int yPos) {
        Deco decoToRemove = null;
        for(Deco deco : decos) {
            if(deco.getxPos() == xPos && deco.getyPos() == yPos) {
                decoToRemove = deco;
                break;
            }
        }
        if(decoToRemove == null) {
            decos.remove(decoToRemove);
            aquarium[xPos][yPos] = 0;
            System.out.println("The decoration at (" + xPos + ", " + yPos + ") was deleted.");
        }else {
            System.out.println("No decoration was found at (" + xPos + ", " + yPos + ")..");
        }
    }

    public void printAquarium() {
        for (int i = 0; i < aquarium.length + (aquarium.length / 3); i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓");
        for (int i = 0; i < aquarium.length; i++) {
            for (int j = 0; j < aquarium[i].length; j++) {
                if (aquarium[i][j] == 0) {

                }
            }
        }
        String aquariumAsString = Arrays.deepToString(aquarium); //1 = tropical fish (saltwater) 2 = blue fish (freshwater) 3 = deco
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", "⛆").replace("1", "\uD83D\uDC20").replace("3", "\uD83E\uDEB8").replace("4", "\uD83E\uDEB8");
        System.out.println(aquariumAsString);

        for (int i = 0; i < aquarium.length + (aquarium.length / 3); i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓");
    }


    private boolean isValidPosition(int xPos, int yPos) {
        return xPos >= 0 && xPos < width && yPos >= 0 && yPos < length;
    }




}
