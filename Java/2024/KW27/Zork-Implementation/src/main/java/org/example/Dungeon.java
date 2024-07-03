package org.example;

import java.util.Hashtable;

public class Dungeon {

    private Room entry;
    private String title;
    private Hashtable<String, Room> rooms;

    public Dungeon(Room entry, String title) {
        this.entry = entry;
        this.title = title;
        rooms = new Hashtable<>();
    }

    public Room getEntry() {
        return entry;
    }

    public String getTitle() {
        return title;
    }

    public void addRoom (Room room){
        rooms.put(room.getName(), room);
    }

    public Room getRoom (String roomname){
        return rooms.get(roomname);
    }
}
