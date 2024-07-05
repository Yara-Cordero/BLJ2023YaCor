package Zork;

public class TakeCommand implements Command{

    private String itemName;

    public TakeCommand(String itemName) {
        this.itemName = itemName;
    }

    public String execute() {
        if (itemName.contains("take")){
            return "hahha\nima take your mama.";
        }

        try {
            Item item = GameState.instance().getItemInVicinityNamed(itemName);
            if (item != null){
                return "There isn't a " + itemName + " here";
            }
        } catch (Item.NoItemException e) {
            throw new RuntimeException(e);
        }

        return "lol";
    }
}
