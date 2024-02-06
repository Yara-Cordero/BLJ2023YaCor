package TextAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
public class ReaderSelf {

    public static void start(String filePath) {

        try{
            String text = readTextFromFile(filePath);



        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(String filePath) throws IOException {
        StringBuilder text = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                text.append(line).append("\n");
            }
        }
        return text.toString();
    }



}
