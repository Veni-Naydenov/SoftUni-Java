/*
 Problem 3.	Largest Sequence of Equal Strings
 Write a program that enters an array of strings and finds in it the largest
 sequence of equal elements. If several sequences have the same longest length,
 print the leftmost of them. The input strings are given as a single line, separated by a space.
 Examples:
 # input: hi yes yes yes bye
 # output: yes yes yes
 */
package homework_collections;

import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String[] arrayStr = inputScanner.nextLine().split(" ");
        int maxCount = 1;
        int indexOfMaxElement = 0;

        for (int i = 0; i < arrayStr.length - 1; i++) {
            int currentCount = 1;
            String currentElement = arrayStr[i];

            while (i < arrayStr.length - 1
                    && currentElement.equals(arrayStr[i + 1])) {
                currentCount++;
                i++;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                i--;
                indexOfMaxElement = i;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.printf("%s ", arrayStr[indexOfMaxElement]);
        }
    }
}