/*
 01.Write a program to enter a number n and n integer numbers and sort and print them.
Keep the numbers in array of integers: int[]. Examples:
input:
7
6 5 4 10 -3 120 4
output: -3 4 4 5 6 10 120
 */
package homework_collections;

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        String nextLine = input.nextLine();
        int[]array=new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        
        Arrays.sort(array);
        
        for (int num : array) {
            System.out.printf("%d ",num);
        }
    }
}