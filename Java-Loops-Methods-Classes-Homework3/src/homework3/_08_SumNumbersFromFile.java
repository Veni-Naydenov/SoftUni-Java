/*
 Problem 8.	Sum Numbers from a Text File
Write a program to read a text file "Input.txt" holding a sequence 
of integer numbers, each at a separate line. Print the sum of
the numbers at the console. Ensure you close correctly the file
in case of exception or in case of normal execution. 
In case of exception (e.g. the file is missing), print "Error" as a result
 */
package homework3;

import java.io.File;
import java.util.Scanner;

public class _08_SumNumbersFromFile {

    public static void main(String[] args) {
        File file = new File("input.txt");

        int sum;
        try (Scanner fileReader = new Scanner(file)) {
            sum = 0;
            while (fileReader.hasNextLine()) {
                sum += fileReader.nextInt();
            }
            
            fileReader.close();
            System.out.printf("Sum %d: ", sum);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
