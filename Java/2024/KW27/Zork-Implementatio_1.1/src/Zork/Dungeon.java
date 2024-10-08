package Zork;

import Zork.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Dungeon {

    private Room entry;
    private String title;
    private Hashtable<String, Room> rooms;
    private Hashtable<String, Item> items;
    private List<ExitInfo> exits;
    private String filepath;

    public Dungeon(Room entry, String title) {
        this.entry = entry;
        this.title = title;
        rooms = new Hashtable<>();
        items = new Hashtable<>();
    }

    public Dungeon(String filepath) throws IllegalDungeonFormatException, IOException {
        this.filepath = filepath;
        rooms = new Hashtable<>();
        items = new Hashtable<>();
        exits = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            this.title = reader.readLine();
            String line = reader.readLine();

            if (!line.equals("===")) {
                throw new IllegalDungeonFormatException("Missing '===' after title.");
            }

            line = reader.readLine().trim();
            if (!line.equals("Items:")) {
                throw new IllegalDungeonFormatException("Missing 'Items:' after '==='.");
            }

            while ((line = reader.readLine()) != null && !line.equals("===")){
                if (line.trim().isEmpty()){
                    continue;
                }


                StringBuilder itemData = new StringBuilder(line + "\n" + reader.readLine() + "\n" + reader.readLine() + "\n");
                while (!(line = reader.readLine()).equals("---")){
                    itemData.append(line + "\n");
                }
                itemData.append(line + "\n");
                Scanner scan = new Scanner(itemData.toString());
                Item item = new Item(scan);
                addItem(item);
            }

            line = reader.readLine().trim();
            if (!line.equals("Rooms:")) {
                throw new IllegalDungeonFormatException("Missing 'Rooms:' after '==='.");
            }

            while ((line = reader.readLine()) != null && !line.equals("===")) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                Room room = new Room(line.trim(), reader);
                addRoom(room);
                if (entry == null) {
                    entry = room;
                }

            }

            line = reader.readLine();
            if (line != null && line.trim().equals("Exits:")) {
                while ((line = reader.readLine()) != null && !line.equals("===")) {
                    if (line.trim().isEmpty() || line.trim().equals("---")) {
                        continue;
                    }
                    String srcName = line.trim();
                    String dir = reader.readLine().trim();
                    String destName = reader.readLine().trim();
                    exits.add(new ExitInfo(srcName, dir, destName));
                }
            }
            for (Room room : rooms.values()) {
                room.initializeContents(this);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }

        // Resolve exits
        for (ExitInfo exitInfo : exits) {
            Room src = getRoom(exitInfo.srcName);
            Room dest = getRoom(exitInfo.destName);
            if (src != null && dest != null) {
                src.addExit(new Exit(exitInfo.dir, src, dest));
            } else {
                throw new IllegalDungeonFormatException("Exit references non-existent room: " + exitInfo.srcName + " or " + exitInfo.destName);
            }
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

    public void addItem (Item item){
        items.put(item.getPrimaryName(), item);
    }

    public Room getRoom (String roomname){
        return rooms.get(roomname);
    }

    public Item getItem(String itemName){
        return items.get(itemName);
    }

    public class IllegalDungeonFormatException extends Exception {
        public IllegalDungeonFormatException(String errorMessage) {
            super(errorMessage);
        }
    }

    private static class ExitInfo {
        String srcName;
        String dir;
        String destName;

        ExitInfo(String srcName, String dir, String destName) {
            this.srcName = srcName;
            this.dir = dir;
            this.destName = destName;
        }
    }
}



