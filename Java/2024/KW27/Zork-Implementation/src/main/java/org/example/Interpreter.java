package org.example;

import java.util.Scanner;

class Interpreter {
    public static void main(String[] args) {
        Dungeon dungeon = buildDungeon();
        GameState.instance().initialize(dungeon);

        Room currentRoom = GameState.instance().getAdventurersCurrentRoom();
        System.out.println(currentRoom.getName());

        Scanner scan = new Scanner(System.in);



    }

    private static Dungeon buildDungeon() {

        Room entry = new Room("Entry");
        Dungeon dungeon = new Dungeon(entry, "Sample Dungeon");

        Room livingRoom = new Room("Living Room");
        Room kitchen = new Room("Kitchen");

        entry.addExit(new Exit("north", entry, livingRoom));
        livingRoom.addExit(new Exit("south", livingRoom, entry));
        livingRoom.addExit(new Exit("east", livingRoom, kitchen));
        kitchen.addExit(new Exit("west", kitchen, livingRoom));

        dungeon.addRoom(entry);
        dungeon.addRoom(livingRoom);
        dungeon.addRoom(kitchen);

        return dungeon;
    }
}