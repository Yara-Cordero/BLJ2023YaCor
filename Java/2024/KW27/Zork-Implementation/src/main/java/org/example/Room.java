package org.example;

import java.util.Hashtable;
import java.util.Scanner;

public class Room {

    private String name;
    private String desc;
    private Hashtable<String, Exit> exits;
    private boolean visited;

    public Room(String name) {
        this.name = name;
        this.exits = new Hashtable<>();
        this.visited = false;
    }

    public String getName() {
        return name;
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

    public void addExit(Exit exit){
        exits.put(exit.getDir(), exit);
    }

    public Room leaveBy(String dir){
        Exit exit = exits.get(dir);
        if (exit != null){
            return exit.getDest();
        }
        return null;
    }

    public class NoRoomException extends Exception {
        public NoRoomException(String errorMessage) {
            super(errorMessage);
        }
    }
}
