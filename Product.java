package Product;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void increaseQuantity(int amount) {
        this.quantity += amount;
        System.out.println("Количество товара увеличено на " + amount + ". Новое количество: " + this.quantity);
    }

    public void decreaseQuantity(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
            System.out.println("Количество товара уменьшено на " + amount + ". Новое количество: " + this.quantity);
        } else {
            System.out.println("Недостаточно товара на складе для уменьшения на " + amount);
        }
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Цена изменена на " + this.price);
    }

    public void displayInfo() {
        System.out.println("Продукт: " + this.name);
        System.out.println("Количество на складе: " + this.quantity);
        System.out.println("Цена: " + this.price);
    }
}
