/*
Problem 6.	Random Hands of 5 Cards
 Write a program to generate n random hands of 5 different cards
form a standard suit of 52 cards
 */

package homework3;

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfCards {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"};
        char[] suits = {'\u2660', '\u2663', '\u2665', '\u2666'};
        
        String[] allCardsArray=new String[52];
        
        int Index=0;
        //generate array with all 52 cards
         for (int i = 0; i < cards.length; i++) {
             for (int j = 0; j < suits.length; j++) {
                 allCardsArray[Index++]=cards[i]+suits[j];
             }
         }
         
         Random rndRandom=new  Random();
         
         int n=input.nextInt();
         
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < 5; j++) {
                  int randomNumber= rndRandom.nextInt(52);
             System.out.printf("%s ",allCardsArray[randomNumber]);
             }
             System.out.println(" ");
         }
    }
}
