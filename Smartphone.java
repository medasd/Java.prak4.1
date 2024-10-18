package ElectronicDevice;

public class Smartphone extends ElectronicDevice {
    private String operatingSystem;

    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price); 
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Операционная система: " + operatingSystem);
    }
}

