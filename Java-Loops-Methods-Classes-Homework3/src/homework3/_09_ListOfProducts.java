/*
 Problem 9.	List of Products
 Create a class Product to hold products, which have name (string)
 and price (decimal number). Read from a text file named "Input.txt" 
 a list of products. Each product will be in format name + space + price. 
 You should hold the products in objects of class Product. Sort the products 
 by price and write them in format price + space + name in a file named "Output.txt".
 Ensure you close correctly all used resources
 */
package homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _09_ListOfProducts {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Product> products = new ArrayList<Product>();
        File file = new File("inputProducts.txt");

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String[] lineArray = fileReader.nextLine().split(" ");

                products.add(new Product(lineArray[0], Double.parseDouble(lineArray[1])));
            }
            Collections.sort(products);
            fileReader.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }

        PrintStream fileWriter = new PrintStream("output.txt");

        for (Product product : products) { 
            fileWriter.println(product.getPrice()+" " + product.getName());
        }

        fileWriter.close();
    }
}
