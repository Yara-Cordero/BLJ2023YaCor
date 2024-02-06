package TextAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
public class ReaderHash {

    public static void start(String filePath){


        try {
            String text = readTextFromFile(filePath);

            int wordCount = countWords(text);
            int sentenceCount = countSentences(text);
            int charCount = countCharacters(text);

            Map<String, Integer> wordFrequencies = getWordFrequencies(text);


            System.out.println("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nWord Count: " + wordCount);
            System.out.println("Sentence Count: " + sentenceCount);
            System.out.println("Character Count: " + charCount);


        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countSentences(String text) {
        String[] sentences = text.split("[.-:!?]+");
        return sentences.length;
    }

    private static int countCharacters(String text){
        return text.length();
    }

    private static Map<String, Integer> getWordFrequencies(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words){
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
        return wordFrequencies;
    }
}
