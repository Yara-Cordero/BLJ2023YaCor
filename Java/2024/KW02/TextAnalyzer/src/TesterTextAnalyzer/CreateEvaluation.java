package TesterTextAnalyzer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;


public class CreateEvaluation {


    public void createFile() {
        FileHandler fileHandler = new FileHandler();
        EvaluateWords evaluator = new EvaluateWords();
        HashMap<String, Integer> wordCount;
        try {
            fileHandler.readFile();
            wordCount = (HashMap<String, Integer>) evaluator.evaluate(fileHandler.getWords());

            String fileName = "script.txt";

            File newFile = new File(fileName + ".txt");
            if (newFile.createNewFile()) ;
            {
                try (FileWriter myWriter = new FileWriter(fileName + "_evaluation.txt")) {
                    myWriter.write("[" + getDateTime() + "]\t\t" + "[" + fileName + "]\n");
                    myWriter.write("-----------------------------------------\n");
                    myWriter.write("Number of unique words: \t" + "[" + evaluator.countUnique() + "]\n");
                    myWriter.write("Total number of words: \t\t" + "[" + fileHandler.getWords().size() + "]\n");

                    myWriter.write("Most common letter:\t\t\t" + "[" + evaluator.findMostUsed(wordCount) + "]\n");

                    myWriter.write("Most common word: \t\t\t" + "[" + evaluator.findMostUsed(wordCount) + "]\n");
           myWriter.write("Most common word: \t\t\t" + "[" + evaluator.findMostUsed(wordCount) + "]\n");

                    myWriter.write("-----------------------------------------\n");


                } catch (IOException e) {
                    System.out.println("Error while writing file");
                    e.printStackTrace();
                }
                System.out.println("File created: " + newFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getDateTime() {

        DateTimeFormatter seh = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        DateTimeFormatter gft = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        DateTimeFormatter flo = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime now = LocalDateTime.now();
        return (flo.format(now));
    }



}



