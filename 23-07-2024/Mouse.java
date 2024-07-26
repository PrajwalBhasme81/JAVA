public class Mouse {
    String model;
    String brand;
    double price;
    int dpi;
    boolean wireless;

    public Mouse() {
        System.out.println("-------------------------------");
        System.out.println("This is the No-Argument constructor");
        System.out.println("-------------------------------");
    }

    public Mouse(String model, String brand, double price, int dpi, boolean wireless) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.dpi = dpi;
        this.wireless = wireless;

        System.out.println("The Model is: " + model);
        System.out.println("The Brand is: " + brand);
        System.out.println("The Price is: " + price);
        System.out.println("The DPI is: " + dpi);
        System.out.println("Wireless: " + (wireless ? "Yes" : "No"));
        System.out.println("-------------------------------");
    }

    public void checkPrice() {
        if (price < 20) {
            System.out.println("The mouse is affordable.");
        } else {
            System.out.println("The mouse is expensive.");
        }
        System.out.println("-------------------------------");
    }

    public void checkDpi(int dpi) {
        if (this.dpi >= dpi) {
            System.out.println("The DPI is sufficient.");
        } else {
            System.out.println("The DPI is not sufficient.");
        }
        System.out.println("-------------------------------");
    }

    public String matchBrand(String brand) {
        if (this.brand.equalsIgnoreCase(brand)) {
            System.out.println("Matching brand found.");
            System.out.println("-------------------------------");
            return "match";
        } else {
            System.out.println("Brand does not match.");
            System.out.println("-------------------------------");
            return "not match";
        }
    }

    public double calculateDiscount(double discountPercentage) {
        double discountedPrice = price - (price * (discountPercentage / 100));
        System.out.println("The discounted price is: " + discountedPrice);
        System.out.println("-------------------------------");
        return discountedPrice;
    }

    public String applyDiscount(double discountPercentage) {
        double discountedPrice = calculateDiscount(discountPercentage);
        if (discountedPrice < price) {
            System.out.println("Discount applied successfully.");
            System.out.println("-------------------------------");
            return "apply";
        } else {
            System.out.println("Discount not applicable.");
            System.out.println("-------------------------------");
            return "not apply";
        }
    }
}
