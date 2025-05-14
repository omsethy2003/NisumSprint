import java.util.*;

class WordCounter {
    public Map<String, Integer> countWords(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        return frequency;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        String text = "Hello world hello Java world Java";
        Map<String, Integer> result = wc.countWords(text);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}