package Wordle;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class Game {

    private static final String reset = "\u001B[0m";
    private static final String green = "\u001B[42m";
    private static final String yellow = "\u001B[43m";
    Scanner scan = new Scanner(System.in);

    private String[] readFile (){
        try{
            List<String> lines = Files.readAllLines(Paths.get("wordlist.txt", String.valueOf(StandardCharsets.UTF_8)));
            String[] wordList = lines.toArray(new String[lines.size()]);
            return wordList;
        }
        catch (IOException e){

            e.printStackTrace();
            return null;
        }
    }



    public Game() {
    }

    void start (){

    }


}
