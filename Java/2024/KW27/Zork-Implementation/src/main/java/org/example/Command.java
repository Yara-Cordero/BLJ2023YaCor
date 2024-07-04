package org.example;

class Command {

    private String dir;

    public Command(String dir) {
        this.dir = dir;
    }

    public String execute(){
        Room currentRoom = GameState.instance().getAdventurersCurrentRoom();
        Room nextRoom = currentRoom.leaveBy(dir);

        if (nextRoom != null){
            GameState.instance().setAdventurersCurrentRoom(nextRoom);
            return "You move " + dir + " to the " + nextRoom.getName();

        }else {
            return "You can't " + dir + " from here";
        }
    }
}
