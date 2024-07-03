package org.example;

import java.util.Hashtable;

public class Exit {

    public String dir;
    public Room src;
    public Room dest;

    public Exit(String dir, Room src, Room dest) {
        this.dir = dir;
        this.src = src;
        this.dest = dest;
    }

    public String getDir() {
        return dir;
    }

    public Room getSrc() {
        return src;
    }

    public Room getDest() {
        return dest;
    }
}
