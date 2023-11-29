package Aquarium;

//Beinhaltet
//String type of deco

public class Deco {

    private String typeOfDeco;
    private boolean type;
    private int xPos;
    private int yPos;


    public Deco(String typeOfDeco, boolean type, int xPos, int yPos) {
        this.typeOfDeco = typeOfDeco;
        this.type = type;
        this.xPos = xPos;
        this.yPos = yPos;
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

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
