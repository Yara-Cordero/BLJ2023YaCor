package TextAnalyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

    class Generator {
    private String originalFileName;
    private Map<String, Integer> wordOccurrences;

    public Generator(String originalFileName, Map<String, Integer> wordOccurrences) {
        this.originalFileName = originalFileName;
        this.wordOccurrences = wordOccurrences;
    }

    public void generateAndSaveEvaluationFile() {
        String evaluationFileName = originalFileName.replace(".txt", "_evaluation.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(evaluationFileName))) {
            // Automatically generate date and time
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

            // Write date/time and name of the read file
            writer.write("[" + timestamp + "] " + originalFileName + "\n");
            writer.write("--------------------------------------------\n");

            // Write number of unique words
            writer.write("Number of unique words:\t" + wordOccurrences.size() + "\n");

            // Write total number of words
            int totalWords = wordOccurrences.values().stream().mapToInt(Integer::intValue).sum();
            writer.write("Total number of words:\t" + totalWords + "\n");

            // Write most common word
            String mostCommonWord = findMostCommonWord();
            writer.write("Most common word:\t" + mostCommonWord + "\n");

            writer.write("--------------------------------------------\n");

            // Write individual word occurrences
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                writer.write(entry.getKey() + "\t" + entry.getValue() + "\n");
            }

            System.out.println("Evaluation file successfully created: " + evaluationFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String findMostCommonWord() {
        if (wordOccurrences == null || wordOccurrences.isEmpty()) {
            return "No words found";
        }

        return wordOccurrences.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No words found");
    }

}