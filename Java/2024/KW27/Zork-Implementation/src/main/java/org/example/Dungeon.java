package org.example;

import java.io.*;
import java.util.Hashtable;
import java.util.Scanner;

public class Dungeon {

    private Room entry;
    private String title;
    private Hashtable<String, Room> rooms;
    private String filepath;

    public Dungeon(Room entry, String title) {
        this.entry = entry;
        this.title = title;
        rooms = new Hashtable<>();
    }

    public Dungeon(String filepath) throws FileNotFoundException {
        this.filepath = filepath;

        BufferedReader reader = new BufferedReader(new FileReader(filepath));

        try {
            title = reader.readLine().trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

    public class IllegalDungeonFormatException extends Exception {
        public IllegalDungeonFormatException(String errorMessage) {
            super(errorMessage);
        }
    }

}



