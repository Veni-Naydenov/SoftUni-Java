/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

public class Product implements Comparable<Product>{

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Product compareFruit) {

        double otherPrice = ((Product) compareFruit).getPrice();

        if (this.price > otherPrice) {
            return 1;
        } else if (this.price == otherPrice) {
            return 0;
        }
        return -1;
    }
}
