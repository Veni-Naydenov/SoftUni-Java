/*
 Problem 3.	Full House
 In most Poker games, the "full house" hand is defined as three cards of the
 same face + two cards of the same face, other than the first, regardless of the card's suits.
 The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" and "A".
 The card suits are "♣", "♦", "♥" and "♠". Write a program to generate and print 
 all full houses and print their number. 
 */
package homework3;

public class _03_FullHouse {

    public static void main(String[] args) {

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"};
        char[] suits = {'\u2660', '\u2663', '\u2665', '\u2666'};
        int counter = 1;

        for (int j = 0; j < cards.length; j++) {
            for (int i = 0; i < suits.length; i++) {
                String threeCards = getThreeCards(cards[j], suits, i);

                for (int k = 0; k < cards.length; k++) {

                    if (k == j) {
                        continue;
                    }
                    int flag=0;
                    for (int l = 0; l < suits.length; l++) {
                        String finalFullHouse = threeCards;
                        String twoCards = getTwoCards(cards[k], suits, l);
                        finalFullHouse += twoCards;

                        System.out.printf("%d: %s%n", counter++, finalFullHouse);
                        if (l==3 && flag==0) {
                            l=1;
                            flag++;
                        }
                    }
                }
            }
        }
    }

    private static String getThreeCards(String card, char[] color, int index) {
        String result3 = "";

        for (int i = 0; i < 3; i++) {
            result3 += card + color[index++] + " ";
            if (index >= 4) {
                index = 0;
            }
        }
        return result3;
    }

    private static String getTwoCards(String card, char[] color, int index) {
        String result2 = "";

        for (int i = 0; i < 2; i++) {
            result2 += card + color[index++] + " ";
            if (index >= 4) {
                index = 0;
            }
        }
        return result2;
    }
}
