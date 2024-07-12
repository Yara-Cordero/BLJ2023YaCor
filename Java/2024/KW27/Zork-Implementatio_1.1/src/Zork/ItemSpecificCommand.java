package Zork;

public class ItemSpecificCommand implements Command {

    public String verb;
    public String itemName;

    public ItemSpecificCommand(String verb, String item) {
        this.verb = verb;
        this.itemName = item;
    }

    public String execute() {
        try {
            Item item = GameState.instance().getItemFromInventoryNamed(itemName);
            if (item == null) {
                return "You don't have a " + itemName + " in your inventory.";
            }
            else {
                return item.getMessageForVerb(verb);
            }

        } catch (Item.NoItemException e) {
            throw new RuntimeException(e);
        }
    }
}
