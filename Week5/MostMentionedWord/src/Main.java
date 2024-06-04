import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Text : ");
        String text = input.nextLine();
        String mentionedWord = mention(text);
        System.out.println("Mentioned Word : " + mentionedWord);
    }

    public static String mention(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordNumbers = new HashMap<>();
        for (String word : words) {
            String lowerCaseWords = word.toLowerCase();
            if (wordNumbers.containsKey(lowerCaseWords)) {
                wordNumbers.put(lowerCaseWords,wordNumbers.get(lowerCaseWords) + 1);
            } else {
                wordNumbers.put(lowerCaseWords,1);
            }
        }
        String mentionedWord = null;
        int bigNumber = 0;
        for (Map.Entry<String,Integer> entry : wordNumbers.entrySet()) {
            if (entry.getValue() > bigNumber) {
                bigNumber = entry.getValue();
                mentionedWord = entry.getKey();
            }
        }
        return mentionedWord;
    }
}