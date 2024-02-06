package TesterTextAnalyzer;

import java.io.*;

import java.lang.reflect.Array;

import java.lang.reflect.Array;

import java.util.*;


public class FileHandler {

    private List<String> words = new ArrayList<>();

    public void readFile() {
        try {
            File file = new File("C:/Projects/BLJ2023YaCor/Java/2024/KW02/TextAnalyzer/src/TesterTextAnalyzer/script.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String word : line.split("\\s")) {
                    if (!word.isEmpty())
                        word = word.replaceAll("\\p{Punct}", "");
                    if (!(word.equals(""))) {
                        words.add(word);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }


}
