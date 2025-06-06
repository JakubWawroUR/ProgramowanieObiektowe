package RunInput; // Dodaj tę linię, jeśli chcesz, aby była w tym samym pakiecie co Run

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZliczanieSlow {

    public void ZliczSlowa() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String inputText = scanner.nextLine();

        String processedText = inputText.toLowerCase();

        processedText = processedText.replaceAll("[^a-z\\s]", "");

        String[] words = processedText.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            word = word.trim();
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Output:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}