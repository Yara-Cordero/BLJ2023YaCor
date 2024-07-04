package org.example;

import java.util.HashSet;

class GameState {

    private static GameState Instance;
    private Room currentRoom;
    private HashSet<Room> visited;
    private Dungeon dungeon;

    private GameState() {
        visited = new HashSet<>();
    }

    public static GameState instance() {
        if (Instance == null) {
            Instance = new GameState();
        }
        return Instance;
    }

    public void initialize(Dungeon dungeon) {
        this.dungeon = dungeon;
        this.currentRoom = dungeon.getEntry();
    }

    public Room getAdventurersCurrentRoom() {
        return currentRoom;
    }

    public void setAdventurersCurrentRoom(Room room){
        this.currentRoom = room;
    }

    public Dungeon getDungeon(){
        return dungeon;
    }

    public void visit(Room room){
        visited.add(room);
    }

    public boolean hasBeenVisited(Room room){
        return visited.contains(room);
    }

    public class IllegalSaveFormatException extends Exception {
        public IllegalSaveFormatException(String errorMessage) {
            super(errorMessage);
        }
    }
}
