package TextAnalyzer;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReaderNorm {

    public static void start(String filePath){

        try {
            String text = readTextFromFile(filePath);

            int wordCount = countWords(text);
            int sentenceCount = countSentences(text);
            int charCount = countCharacters(text);

            System.out.println("Word Count: " + wordCount);
            System.out.println("Sentence Count: " + sentenceCount);
            System.out.println("Character Count: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(String filePath) throws IOException {

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static int countWords(String text){
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countSentences(String text){
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    private static int countCharacters(String text){
        return text.length();
    }
}
