import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj teskt:");
        String text = input.nextLine();

        text = text.toLowerCase().replace("[^a-ząćęłńóśżź]","");

        String[] words = text.split("\\s++");

        Map<String, Integer> wordMap = new HashMap<>();

        for(String word: words){
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        System.out.println("\nLiczba wystąpień słów:\n");
        for(Map.Entry<String,Integer> entry: wordMap.entrySet()){
            System.out.println(entry.getKey);
        }
    }
}