/*
 Problem 12.	Cards Frequencies
 We are given a sequence of N playing cards from a standard deck. 
 The input consists of several cards (face + suit), separated by a space. 
 Write a program to calculate and print at the console the frequency of each
 card face in format "card_face -> frequency". The frequency is calculated by the
 formula appearances / N and is expressed in percentages with exactly 2 digits after the 
 decimal point. The card faces with their frequency should be printed in the order of the 
 card face's first appearance in the input. The same card can appear multiple times in the input, 
 but it's face should be listed only once in the output. 
 */
package homework_collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordsArray;
        wordsArray = input.nextLine().split("[\\W ]+");

        Map<String, Integer> map = new LinkedHashMap<>();

        int maxCount = 1;
        ArrayList<String> list = new ArrayList<>();
        //make a list of unique elements!
        for (int i = 0; i < wordsArray.length; i++) {
            if (!list.contains(wordsArray[i])) {
                list.add(wordsArray[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            String currentWord = list.get(i);

            for (int j = 0; j < wordsArray.length; j++) {
                if (currentWord.equals(wordsArray[j])) {
                    counter++;
                }
            }
            map.put(currentWord, counter);
        }

        float length = wordsArray.length;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.printf("%s -> %.2f%s %n", key, (value / length) * 100, "%");
        }
    }
}
