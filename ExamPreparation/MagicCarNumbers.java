/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicCarNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int magicNum = Integer.parseInt(input.nextLine());

        List<String> numsList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int[] lettersNum = new int[]{10, 20, 30, 50, 80, 110, 130, 160, 200, 240};

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        if ((j == k && k == l)
                                || (i == j && j == k)
                                || (i == j && k == l && j != k)
                                || (i == k && j == l && i != j)
                                || (i == l && j == k && i != j)
                                || (i == j && j == k && k == l)) {
                            sb.append(i).append(j).append(k).append(l);
                            numsList.add(sb.toString());
                            sb.setLength(0);
                        }
                    }
                }
            }
        }

        int result = 0;
        String[] numsArr = new String[numsList.size()];
        numsArr = numsList.toArray(numsArr);

        for (int i = 0; i < lettersNum.length; i++) {
            int x = lettersNum[i];

            for (int j = 0; j < lettersNum.length; j++) {
                int y = lettersNum[j];

                for (int k = 0; k < numsArr.length; k++) {
                    int sum = 40 + x + y + (getSumInString(numsArr[k]));

                    if (sum == magicNum) {
                        result++;
                    }
                }

            }
        }

        System.out.println(result);
    }

    private static int getSumInString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(Character.toString(s.charAt(i)));
        }
        return sum;
    }
}
