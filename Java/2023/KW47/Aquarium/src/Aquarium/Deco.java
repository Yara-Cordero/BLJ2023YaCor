package Aquarium;

//Beinhaltet
//String type of deco

public class Deco {
    private String typeOfDeco;
    private boolean type;
    private int xPos;
    private int yPos;


    public Deco(String typeOfDeco, boolean type) {
        this.typeOfDeco = typeOfDeco;
        this.type = type;
    }

    public void setXYPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getTypeOfDeco() {
        return typeOfDeco;
    }

    public void setTypeOfDeco(String typeOfDeco) {
        this.typeOfDeco = typeOfDeco;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getXPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Deco{" +
                "typeOfDeco='" + typeOfDeco + '\'' +
                ", type=" + type +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
