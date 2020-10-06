package ua.hillel.javaElememtary.hw17.regex.processor;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextHandler {

    private String inputText;

    public TextHandler(String inputText) {
        this.inputText = inputText;
    }

    public int calculatePuncts(){
        int punctsQuantity = 0;

        Pattern pattern = Pattern.compile("[!?:,.\"]");
        Matcher matcher = pattern.matcher(inputText);
        //System.out.println(inputText);
        while (matcher.find()){
            punctsQuantity++;
        }

        return punctsQuantity;
    }

    private String[] getWords (){

        Pattern pattern = Pattern.compile("[\\W 0-9]");
        return pattern.split(inputText);

    }

    public HashMap<String, Integer> countWords(){
        HashMap<String, Integer> foundWords = new HashMap<>();
        int value = 1;
        for (String key: getWords()) {
            if (foundWords.containsKey(key)){
                foundWords.put(key, foundWords.get(key) + 1);
            }else {
                foundWords.put(key, value);
            }
        }
        foundWords.remove("");
        return foundWords;

    }

    public String changeWords (int charPosition, char newChar){

    }

    public void printReport () {

        for (Map.Entry entry: countWords().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }

    }

    public void printReport2(){
        for (String st: getWords()) {
            System.out.println (st);
        }
    }

    /*public HashMap <String, Integer> findWords (String[] input){
        HashMap<String, Integer> found = new HashMap<>();

        return
    } //*/
}
