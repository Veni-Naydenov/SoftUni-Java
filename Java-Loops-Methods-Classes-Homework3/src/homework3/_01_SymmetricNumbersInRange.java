
/*1.Problem 1.	Symmetric Numbers in Range
 Write a program to generate and print all symmetric numbers in given
 range [start…end] (0 ≤ start ≤ end ≤ 999). 
 A number is symmetric if its digits are symmetric toward its middle.
 For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 
 are not symmetric.*/
package homework3;

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = input.nextInt();
        
        System.out.print("Enter end number: ");
        int end = input.nextInt();
        
        if (start<10 ) {
            for (int i = start; i < 10; i++) {
                System.out.printf("%d ",i);
            }
        }
        
        int line=0;
        for (int i = start; i <= end; i++) {
            if (isSymmetric(i)) {
                if (line==10) {
                    System.out.printf("%n");
                    line=0;
                }
                System.out.printf("%3d ",i);
                line++;
            }
        }
    }
// here is the method which checks, whether the number is symmetric.
    public static boolean isSymmetric(int number) {
        boolean isSymmetric = false;
        int endNum;
        int frontNum;
        if (number<100) {
            endNum=number%10;
            number/=10;
            frontNum=number%10;
            
            if (frontNum==endNum) {
                isSymmetric=true;
                return isSymmetric;
            }
        } else {
              endNum=number%10;
            number/=100;
            frontNum=number%10;
            
            if (frontNum==endNum) {
                isSymmetric=true;
                return isSymmetric;
            }  
        }

        return isSymmetric;
    }
}
