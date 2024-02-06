package TesterTextAnalyzer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EvaluateWords {

    private Map<String, Integer> wordCount = new HashMap<>();

    public Map<String, Integer> evaluate(List<String> wordsList) {
        for (String word : wordsList) {
            Integer count = wordCount.get(word);
            wordCount.put(word, (count == null) ? 1 : count + 1);
        }
        return wordCount;
    }

    public int countUnique() {
        int counter = 0;
        for (Integer amount : wordCount.values()) {
            if (amount == 1) {
                counter++;
            }
        }
        return counter;
    }

    public String findMostUsed(Map<String, Integer> wordMap) {

        int max = 0;
        String key = null;
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    public void sortList() {

    }



}
