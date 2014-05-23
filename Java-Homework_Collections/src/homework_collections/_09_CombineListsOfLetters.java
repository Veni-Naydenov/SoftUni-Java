/*
 Problem 9.	Combine Lists of Letters
 Write a program that reads two lists of letters l1 and l2 and combines them:
 appends all letters c from l2 to the end of l1, but only when c does not appear in l1.
 Print the obtained combined list.
 All lists are given as sequence of letters separated by a single space,
 each at a separate line. Use ArrayList<Character> of chars to keep the input and output lists. 
 */
package homework_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //left letters(first input line)
        char[] arrayLeft = input.nextLine().toCharArray();
        ArrayList<Character> leftList = new ArrayList<>();
        //right letters(second input line)
        char[] arrayRight = input.nextLine().toCharArray();
        ArrayList<Character> rightList = new ArrayList<>();
        //add char values from char[] in to ArrayList of Character
        addCharsToList(arrayLeft, leftList);
        addCharsToList(arrayRight, rightList);
        // list for the result
        ArrayList<Character> finalCombination = new ArrayList<>();
        addCharsToList(arrayLeft, finalCombination);

        boolean alreadyHave = false;

        for (int i = 0; i < rightList.size(); i++) {
            Character currentChar = rightList.get(i);
            alreadyHave = false;
            for (int j = 0; j < leftList.size(); j++) {
                if (currentChar.equals(leftList.get(j))) {
                    alreadyHave = true;
                    break;
                }
            }

            if (!alreadyHave) {
                finalCombination.add(currentChar);
            }
        }
        //Print result
        for (int i = 0; i < finalCombination.size(); i++) {
            System.out.printf("%s ", finalCombination.get(i));
        }
    }

    private static void addCharsToList(char[] arrayLeft, ArrayList<Character> leftList) {
        for (int i = 0; i < arrayLeft.length; i += 2) {
            leftList.add(arrayLeft[i]);
        }
    }
}
