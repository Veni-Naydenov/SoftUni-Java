/*
 Problem 5.	Angle Unit Converter (Degrees ↔ Radians)
 Write a method to convert from degrees to radians.
 Write a method to convert from radians to degrees. 
 You are given a number n and n queries for conversion. 
 Each conversion query will consist of a number + space + measure.
 Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians.
 Print the results as n lines, each holding a number + space + measure.
 Format all numbers with 6 digit after the decimal point. 
 */
package homework3;

import java.util.Scanner;
import javax.print.DocFlavor;

public class _05_DegreesToRadians {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n= ");
        int n = new Integer(input.nextLine());
        String[] comandLineArr = new String[n];
        double result = 0;
        // read the lines with value with deg or rad, and put them in to array 
        System.out.println("Enter deg or rad for convert(example: 180 deg)");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ": ");
            comandLineArr[i] = input.nextLine();
        }

        System.out.printf("The result is: %n");
        
        for (int i = 0; i < n; i++) {
            String[] arrayConvert = comandLineArr[i].split(" ");
            // parse to double the string from the array arrayConvert
            double value = Double.parseDouble(arrayConvert[0]);

            if (arrayConvert[1].equalsIgnoreCase("deg")) {
                result = convertToRadians(value);
                System.out.printf((i + 1) + ": %.6f %s%n", result, "rad");
            } else {
                result = convertToDegrees(value);
                System.out.printf((i + 1) + ": %.6f %s%n", result, "deg");
            }
        }
    }

    private static double convertToRadians(double deg) {
        double result = deg * (Math.PI / 180);
        return result;
    }

    private static double convertToDegrees(double rad) {
        double result = rad * (180 / Math.PI);
        return result;
    }
}
