/*
 Problem 4.	Longest Increasing Sequence
 Write a program to find all increasing sequences inside an array of integers. 
 The integers are given in a single line, separated by a space. 
 Print the sequences in the order of their appearance in the input array,
 each at a single line. Separate the sequence elements by a space. 
 Find also the longest increasing sequence and print it at the last line. 
 If several sequences have the same longest length, print the leftmost of them
 */
package homework_collections;

import java.util.Scanner;

public class _04_LongestIncreasingSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayStr = input.nextLine().split(" ");
        int maxSequence = 1;
        int indexMaxStart = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            System.out.printf("%d", parseToInt(arrayStr[i]));
            int counter = 1;
            while (i < arrayStr.length - 1
                    && parseToInt(arrayStr[i]) < parseToInt(arrayStr[i + 1])) {
                counter++;
                System.out.printf(" %d", parseToInt(arrayStr[i + 1]));
                i++;
            }
            System.out.printf("%n");
            if (counter > maxSequence) {
                maxSequence = counter;
                indexMaxStart = (i + 1) - maxSequence;//find the start position for the longest sequence.
            }
        }
        System.out.print("Longest: ");
        for (int j = indexMaxStart; j < indexMaxStart + maxSequence; j++) {
            System.out.printf("%d ", parseToInt(arrayStr[j]));
        }
    }

    private static int parseToInt(String number) {
        return Integer.parseInt(number);
    }
}
