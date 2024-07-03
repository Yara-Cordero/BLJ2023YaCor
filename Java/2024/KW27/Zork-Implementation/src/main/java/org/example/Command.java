package org.example;

class Command {

    private String dir;

    public Command(String dir) {
        this.dir = dir;
    }

    public String execute(){
        return dir;
    }
}
