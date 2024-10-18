package Product;

public class zd3 {
    public static void main(String[] args) {
        Product product = new Product("Яблоко", 100, 0.5);

        product.displayInfo();

        product.increaseQuantity(20);

        product.decreaseQuantity(30);

        product.changePrice(0.7);

        product.displayInfo();
    }
}
