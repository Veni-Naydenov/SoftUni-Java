/*
 Problem 5.	Count All Words
 Write a program to count the number of words in given sentence. 
 Use any non-letter character as word separator
 */
package homework_collections;

import java.util.Scanner;

public class _05_CountAllWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] wordsArray;
        wordsArray = input.nextLine().split("[\\W' ]+");
        System.out.printf("Words: %d", wordsArray.length);
    }
}
