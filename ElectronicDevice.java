package ElectronicDevice;

public class ElectronicDevice {
    private String brand;
    private String model;
    private double price;

    public ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + price);
    }
}

