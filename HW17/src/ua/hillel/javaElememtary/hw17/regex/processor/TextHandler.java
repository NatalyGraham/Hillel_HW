package ua.hillel.javaElememtary.hw17.regex.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextHandler {

    private String inputText;

    public TextHandler(String inputText) {
        this.inputText = inputText;
    }

    public int calculatePuncts() {
        int punctsQuantity = 0;

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(inputText);
        while (matcher.find()) {
            punctsQuantity++;
        }

        return punctsQuantity;
    }

    public List<String> countUniqueWords() {
        List<String> uniqueWordQuantity = new ArrayList<>();
        int quantity = 0;

        for (String s : getUniqueWords()) {
            Pattern pattern = Pattern.compile("\\b" + s + "\\b");
            Matcher matcher = pattern.matcher(inputText);

            while (matcher.find()) {
                quantity++;
            }

            uniqueWordQuantity.add(s + ": " + quantity);
            quantity = 0;
        }

        return uniqueWordQuantity;
    }

    private List<String> getUniqueWords() {
        Pattern pattern = Pattern.compile("(\\w+\\b)(?!.*\\1\\b)");
        Matcher matcher = pattern.matcher(inputText);

        List<String> uniqueWords = new ArrayList<>();

        while (matcher.find()) {
            uniqueWords.add(matcher.group());
        }
        return uniqueWords;
    }

    public String changeWords(int charPosition, char newChar) {
        return inputText.replaceAll(String.format("(\\b\\p{Alpha}{%d})\\p{Alpha}", charPosition - 1), "$1" + newChar);
    }

    public String matchFirstLast() {

        StringBuilder uniqueWordsText = new StringBuilder();
        for (String s : getUniqueWords()) {
            uniqueWordsText.append(s + " ");
        }

        Pattern pattern = Pattern.compile("\\b((\\w)\\w*\\2)\\b");
        Matcher matcher = pattern.matcher(uniqueWordsText);

        StringBuilder uniqueWords = new StringBuilder();
        while (matcher.find()) {
            uniqueWords.append(matcher.group() + " ");
        }

        return uniqueWords.toString();

    }


}
