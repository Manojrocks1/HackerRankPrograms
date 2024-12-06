package Day10HR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyWordMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Call the function to count word frequency
        Map<String, Integer> wordFrequency = countWordFrequency(input);

        // Print the result
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<String, Integer> countWordFrequency(String sentence) {
        // Remove punctuation and convert to lowercase
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a map to store word frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Populate the map
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}
