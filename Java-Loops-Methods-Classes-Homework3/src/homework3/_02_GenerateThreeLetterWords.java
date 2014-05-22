/*
 Problem 2.	Generate 3-Letter Words
 Write a program to generate and print all 3-letter words consisting of given
 set of characters. For example if we have the characters 'a' and 'b', 
 all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb".
 The input characters are given as string at the first line of the input.
 Input characters are unique (there are no repeating characters). 
 */
package homework3;

import java.util.Scanner;

public class _02_GenerateThreeLetterWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word with length <=3: ");
        String inputStr = input.nextLine();
        String[] array = inputStr.split("");
        String result = "";
        String result2 = "";
        boolean haveOneLetterB=false;
        
        for (int i = 0; i < array.length; i++) {
            result = array[i];
            if (haveOneLetterB) {
                break;
            }
            
            for (int j = 0; j < array.length; j++) {
                result2 = result + array[j];

                for (int k = 0; k < array.length; k++) {
                    String finalResult = result2;
                    finalResult += array[k];
                    System.out.printf("%s%n", finalResult);
                    
                    if (array.length==1) {
                        haveOneLetterB=true;
                    }
                }
            }
        }
    }
}
