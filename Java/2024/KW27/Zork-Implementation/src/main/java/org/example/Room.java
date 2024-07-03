package org.example;

import java.util.Hashtable;

public class Room {

    public String name;
    public String desc;
    public Hashtable<String, Exit> exits;

    public Room(String name) {
        this.name = name;
        this.exits = new Hashtable<>();
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String describe(){
        return desc;
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
}
