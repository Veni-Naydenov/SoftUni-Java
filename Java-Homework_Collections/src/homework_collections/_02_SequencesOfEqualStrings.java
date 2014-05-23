/*
 Problem 2.	Sequences of Equal Strings
 Write a program that enters an array of strings and finds in it all sequences of equal elements.
 The input strings are given as a single line, separated by a space. Examples:
 # input: hi yes yes yes bye
 # output: 
 hi
 yes yes yes
 bye
 */
package homework_collections;

import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayStrings = input.nextLine().split(" ");

        for (int i = 0; i < arrayStrings.length; i++) {

            if (i != arrayStrings.length - 1) {
                String current=arrayStrings[i];
                System.out.printf("%s", current);
                
                while( i<arrayStrings.length-1
                        && current.equals(arrayStrings[i + 1])) {
                    System.out.printf(" %s", arrayStrings[i]);
                    i++;
                }
                System.out.printf("%n");
            }
            
            if (arrayStrings.length==1 || arrayStrings.length-1==i ) {
                System.out.printf("%s", arrayStrings[i]);
            }
        }
    }
}
