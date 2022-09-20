package com.fdmgroup.Collections.Exercises;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CollectionsExercise {
    public HashSet<String> getUniqueNames(String ...name){
        return new HashSet<String>(Arrays.asList(name)) ;
    }

    public HashMap<String, Color> selectUniqueColors(){
        HashMap<String, Color> color = new HashMap<String, Color>();
        color.put("black", Color.black);
        color.put("blue", Color.blue);
        color.put("cyan", Color.cyan);
        color.put("darkGrey", Color.darkGray);
        color.put("grey", Color.gray);
        color.put("green", Color.green);
        color.put("yellow", Color.yellow);
        color.put("light grey", Color.lightGray);
        color.put("magenta", Color.magenta);
        color.put("orange", Color.orange);
        color.put("pink", Color.pink);
        color.put("red", Color.red);
        color.put("white", Color.white);

        return color;
    }

    public Map<Character,Integer> getLetterCount(String string){
        string = string.toLowerCase();
        Map<Character,Integer> letterCount = new TreeMap<>();

        char[] characters = string.toCharArray();

        for (char letter : characters) {
            if (letter < 'a' || letter > 'z') {
                continue;
            }

            if (letterCount.containsKey(letter)) {
                int currentCount = letterCount.get(letter);
                letterCount.put(letter, currentCount+1);
            } else {
                letterCount.put(letter, 1);
            }
        }

        return letterCount;
    }

    public int countDuplicates(String string){
        string = string.replaceAll("[^a-zA-Z]", " "); // remove non letters
        string = string.replaceAll("( )+", " "); // remove duplicate spaces
        string = string.toLowerCase();  // convert to lower case

        String[] words = string.split(" ");

        //add words to list
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        Set<String > uniqueWords = new HashSet<>(wordList);
        int duplicateWords = 0;

        for (String word : uniqueWords) {
            int occurrences = Collections.frequency(wordList, word);

            if (occurrences > 1) {
                duplicateWords ++;
            }
        }
        return duplicateWords;
    }
}
