package Aquarium;

//Beinhaltet
//GET FOR NAME AND SUCH SETTER AND GETTER
//String name of fish (type of fish)
//Boolean (freshwater = true or saltwater = false)
//String color of fish
//int size of fish
//Boolean gender (true = female false = male)
//int xPos- and yPos-axis define (not a function)
//move(xPos, yPos);
//setXYPos(x,y);

public class Fish {
    private String nameOfFish;
    private int typeOfFish;
    private boolean isSaltWater;
    private String colorOfFish;
    private boolean isFemale;
    private int xPos;
    private int yPos;


    public Fish(String nameOfFish, int typeOfFish, boolean isSaltWater, String colorOfFish, boolean isFemale) {
        this.nameOfFish = nameOfFish;
        this.typeOfFish = typeOfFish;
        this.isSaltWater = isSaltWater;
        this.colorOfFish = colorOfFish;
        this.isFemale = isFemale;
    }

    public void setXYPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public boolean getSaltWater() {
        return isSaltWater;
    }

    public String getNameOfFish() {
        return nameOfFish;
    }

    public void setNameOfFish(String nameOfFish) {
        this.nameOfFish = nameOfFish;
    }

    public int getTypeOfFish() {
        return typeOfFish;
    }

    public void setTypeOfFish(int typeOfFish) {
        this.typeOfFish = typeOfFish;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getColorOfFish() {
        return colorOfFish;
    }

    public void setColorOfFish(String colorOfFish) {
        this.colorOfFish = colorOfFish;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "nameOfFish='" + nameOfFish + '\'' +
                ", typeOfFish=" + typeOfFish +
                ", isSaltWater=" + isSaltWater +
                ", colorOfFish='" + colorOfFish + '\'' +
                ", isFemale=" + isFemale +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
