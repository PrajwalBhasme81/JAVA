public class SmartphoneProfile {
    // Primitive data types
    byte numberOfCameras = 3;
    short screenSize = 6; // in inches
    int ramSize = 8; // in GB
    long imeiNumber = 123456789012345L;
    float weight = 0.173f; // in kg
    double price = 799.99;
    char energyRating = 'A';
    boolean is5GCapable = true;

    // String class
    String brand = "Samsung";
    String model = "Galaxy S21";
    String processor = "Exynos 2100";
    String operatingSystem = "Android 11";
    String color = "Phantom Gray";

    // Additional instance variables
    byte batteryLife = 24; // in hours
    short warrantyPeriod = 12; // in months
    int storageCapacity = 256; // in GB
    long phoneNumber = 1234567890L;
    boolean isWaterResistant = true;

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Color: " + color);
        System.out.println("Number of Cameras: " + numberOfCameras);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("IMEI Number: " + imeiNumber);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Is 5G Capable: " + is5GCapable);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Is Water Resistant: " + isWaterResistant);
    }

    public static void main(String[] args) {
        SmartphoneProfile smartphone = new SmartphoneProfile();
        smartphone.displayInfo();
    }
}
