package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Interpreter {
    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "C:\\Projects\\BLJ2023YaCor\\Java\2024\\KW27\\Zork-Implementation\\src\\main\\resources\\simple.txt";


        Dungeon dungeon = new Dungeon(filepath);
        GameState.instance().initialize(dungeon);

        /*
        Room currentRoom = GameState.instance().getAdventurersCurrentRoom();
        System.out.println(currentRoom.describe());

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("> ");
            String input = scan.nextLine();
            Command command = CommandFactory.instance().parse(input);
            String result = command.execute();
            System.out.println(result);

            currentRoom = GameState.instance().getAdventurersCurrentRoom();
            System.out.println(currentRoom.describe());
        }


         */

    }


    private static Dungeon buildDungeon() {

        Room entry = new Room("Entry");
        entry.setDesc("This is a narrow entry way to a seemingly large house");
        Dungeon dungeon = new Dungeon(entry, "Sample Dungeon");

        Room livingRoom = new Room("Living Room");
        livingRoom.setDesc("The living room is decorated with all kinds of cats.\nMay it be small or large, all cat memorabilia seems to have its place here");
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