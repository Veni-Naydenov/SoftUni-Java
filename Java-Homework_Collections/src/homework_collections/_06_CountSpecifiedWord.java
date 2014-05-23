/*
 Problem 6.	Count Specified Word
 Write a program to find how many times a word appears in given text.
 The text is given at the first input line. The target word is given at the second input line. 
 The output is an integer number. Please ignore the character casing.
 Consider that any non-letter character is a word separator. 
 */
package homework_collections;

import java.util.Scanner;

public class _06_CountSpecifiedWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordsArray;
        wordsArray = input.nextLine().split("[\\W' ]+");

        String wantedWord = input.nextLine().toLowerCase();
        int counter = 0;
        //you can use equalsIgnoreCase instead of of equals !Then toLowerCase is ot necessary!
        for (String textItem : wordsArray) {
            if (textItem.toLowerCase().equals(wantedWord)) {
                counter++;
            }
        }
        System.out.printf("%d ", counter);
    }
}
