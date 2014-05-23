/*
 Problem 7.	Count Substring Occurrences
 Write a program to find how many times given string appears in given text as substring.
 The text is given at the first input line. The search string is given at the second input line. 
 The output is an integer number. Please ignore the character casing. 
 */
package homework_collections;

import java.util.Scanner;

public class _07_CountSubstringOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordsArray;
        wordsArray = input.nextLine().split("[\\W' ]+");

        String wantedSubStr = input.nextLine().toLowerCase();
        int counter = 0;
        int maxCount = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i].toLowerCase();
            maxCount += countSubstrings(word, wantedSubStr);
        }

        System.out.printf("%d ", maxCount);
    }

    public static int countSubstrings(String word, String sub) {
        int indexOf = word.indexOf(sub);
        int count = 0;
        while (indexOf > -1) {
            count++;
            indexOf = word.indexOf(sub, indexOf + 1);
        }
        return count;
    }
}
