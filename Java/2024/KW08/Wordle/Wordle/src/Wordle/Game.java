package Wordle;

import java.util.*;
import java.io.*;

public class Game {

    private static final String reset = "\u001B[0m";
    private static final String green = "\u001B[32m";
    private static final String yellow = "\u001B[33m";
    private static final String red = "\u001B[31m";
    Scanner scan = new Scanner(System.in);

    private String[] wordList;

    public Game() {
    }

    private String[] ReadContent(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line;
            line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString().toUpperCase();

            String[] wordList = everything.split(System.lineSeparator());
            return wordList;
        } finally {
            br.close();
        }
    }

    void start() throws IOException {
        String filePath = "src/Wordle/wordlist.txt";
        wordList = ReadContent(filePath);

        String chosenWord = wordList[new Random().nextInt(wordList.length)];

        StringBuilder b = new StringBuilder();

        int attempts = 6;

        System.out.println("Enter a 5 letter word:");
        do{
            String userInput = scan.nextLine().toUpperCase().trim().replaceAll("\\s+", " ");


            if (userInput.length() != 5){
                System.out.println("Only 5 letter words are allowed");
                continue;
            }

            if (!Arrays.asList(wordList).contains(userInput)){
                System.out.println("Word is not in the list.");
                continue;
            }

            if (userInput.equals(chosenWord)){
                System.out.println("Congrats! You guessed correctly");
                System.out.println(green + userInput + reset);
                return;
            } else {
                for(int i = 0; i < userInput.length(); i++){

                    char c = userInput.charAt(i);
                    if (chosenWord.charAt(i) == c){
                        b.append(green).append(c).append(reset);
                    } else if (chosenWord.contains(Character.toString(c))) {
                        b.append(yellow).append(c).append(reset);
                    }else {
                        b.append(c);
                    }
                }
                System.out.println(b);
                b.setLength(0);
                attempts--;
                if(attempts != 0){
                    System.out.println("You have " + red + attempts + reset + " attempts left.");
                }
            }
        }while (attempts > 0);

        System.out.println("You have run out of attempts :(");
        System.out.println("The word was " + chosenWord);
    }

}
