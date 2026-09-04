package Pertemuan1;

public class Procedural {
    public static void main(String[] args) {
        String itemName1 = "Coffee";
        float price1 = 120000.0f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        float price2 = 30000.0f;
        int quantity2 = 1;

        System.out.println("Product: " + itemName1);
        System.out.println("Quantity: " + quantity1);
        System.out.println("Total: " + total(price1, quantity1));

        System.out.println();

        System.out.println("Product: " + itemName2);
        System.out.println("Quantity: " + quantity2);
        System.out.println("Total: " + total(price2, quantity2));
    }

    static float total(float price, int quantity) {
        return price * quantity;
    }
}
