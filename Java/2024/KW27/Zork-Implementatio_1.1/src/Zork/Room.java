package Zork;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

public class Room {

    private String name;
    private String desc;
    private Hashtable<String, Exit> exits;
    private HashSet<Item> contents;
    private boolean visited;

    public Room(String name) {
        this.name = name;
        this.exits = new Hashtable<>();
        this.visited = false;
    }

    public Room(String name, BufferedReader reader) throws IOException {
        this.name = name;
        this.exits = new Hashtable<>();
        this.contents = new HashSet<>();
        this.visited = false;
        StringBuilder descBuilder = new StringBuilder();
        try {
            this.desc = reader.readLine().trim();
            String line;
            while ((line = reader.readLine()) != null && !line.equals("---")) {
                if (line.startsWith("Contents:")){
                    String[] items = line.substring(9).split(",");
                    for (String itemName : items){
                        Item item = GameState.instance().getDungeon().getItem(itemName.trim());
                        if (item != null){
                            addItem(item);
                        }
                    }
                } else {
                    descBuilder.append(line).append("\n");
                }
            }
            this.desc = descBuilder.toString().trim();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        StringBuilder description = new StringBuilder(name + "\n" + desc);
        for (Item items : contents){
            description.append("There is a").append(items.getPrimaryName()).append("\n");
        }
        description.append("\nExits:");
        for(String dir : exits.keySet()) {
            description.append(" ").append(dir);
        }
        return description.toString();
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String describe(){
        if (!visited){
            visited = true;
            GameState.instance().visit(this);
            StringBuilder description = new StringBuilder(name + "\n" + desc +  "\nExits:");
            for(String dir : exits.keySet()) {
                description.append(" ").append(dir);
            }
            return description.toString();
        } else {
            return name;
        }
    }

    public Item getItemNamed(String name){
        for (Item item: contents){
            if (item.goesBy(name)){
                return item;
            }
        }
        return null;
    }

    private HashSet<Item> getContents(){
        return contents;
    }

    public void addExit(Exit exit){
        exits.put(exit.getDir(), exit);
    }

    public void addItem(Item item){
        contents.add(item);
    }

    public void removeItem(Item item){
        contents.remove(item);
    }

    public Room leaveBy(String dir){
        Exit exit = exits.get(dir);
        if (exit != null){
            return exit.getDest();
        }
        return null;
    }

    public static class NoRoomException extends Exception {
        public NoRoomException(String errorMessage) {
            super(errorMessage);
        }
    }
}
