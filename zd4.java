package ElectronicDevice;

public class zd4 {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice("Samsung", "Galaxy Tab", 299.99);

        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 999.99, "iOS");

        System.out.println("Информация об устройстве:");
        device.displayInfo();

        System.out.println("\nИнформация о смартфоне:");
        smartphone.displayInfo();
    }
}

