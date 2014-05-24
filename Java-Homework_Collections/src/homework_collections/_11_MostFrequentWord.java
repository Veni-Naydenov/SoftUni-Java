/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_collections;

import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class _11_MostFrequentWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordsArray;
        wordsArray = input.nextLine().toLowerCase().split("[\\W' ]+");

        Map<String, Integer> map = new TreeMap<>();
        TreeSet<String> set = new TreeSet<>();
        int maxCount = 1;

        for (String word : wordsArray) {
            set.add(word);
        }

        for (int i = 0; i < 2; i++) {
            for (String word : set) {
                int counter = 0;
                String currentWord = word;
                
                for (int j = 0; j < wordsArray.length; j++) {
                    if (currentWord.equals(wordsArray[j])) {

                        counter++;
                    }
                }
                if (counter >= maxCount) {
                    maxCount = counter;
                    if (i > 0) {
                        //now we know the max count!
                        map.put(currentWord, counter);
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%s -> %d%n",key,value);
        }
    }
}
