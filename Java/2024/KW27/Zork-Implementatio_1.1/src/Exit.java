

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

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


    public class NoExitException extends Exception {
        public NoExitException(String errorMessage) {
            super(errorMessage);
        }
    }
}
