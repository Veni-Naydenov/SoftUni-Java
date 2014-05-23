/*
 Problem 10.	Extract All Unique Words
 At the first line at the console you are given a piece of text. 
 Extract all words from it and print them in alphabetical order.
 Consider each non-letter character as word separator. 
 Take the repeating words only once. Ignore the character casing. 
 Print the result words in a single line, separated by spaces. 
 */
package homework_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _10_ExtractAllUniqueWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordsArray;
        wordsArray = input.nextLine().split("[\\W' ]+");
        
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = wordsArray[i].toLowerCase();
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < wordsArray.length; i++) {
            set.add(wordsArray[i]);
        }

        String[] result = new String[set.size()];
        result = set.toArray(result);
        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s ", result[i]);
        }
    }
}
