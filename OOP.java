class Product {
    private final String itemName;
    private final float price;

    public Product (String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getName() {
        return itemName;
    }
}

public class OOP {
    public static void main(String[] args) {
        
        Product product1 = new Product("Coffee", 120000.0f);
        Product product2 = new Product("Sugar", 30000.0f);

        int quantity1 = 3;
        int quantity2 = 1;

        System.out.println("Produk          : " + product1.getName());
        System.out.println("Jumlah Produk   : " + quantity1);
        System.out.println("Total           : " + product1.total(quantity1));

        System.out.println();

        System.out.println("Produk          : " + product2.getName());
        System.out.println("Jumlah Produk   : " + quantity2);
        System.out.println("Total           : " + product2.total(quantity2));
    }
}
