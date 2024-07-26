public class Cosmetic {
    String productName;
    String brand;
    float price;
    String skinType;
    float weight;

    public Cosmetic() {
        System.out.println("-------------------------------");
        System.out.println("This is the No-Argument constructor");
        System.out.println("-------------------------------");
    }

    public Cosmetic(String productName, String brand, float price, String skinType, float weight) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.skinType = skinType;
        this.weight = weight;

        System.out.println("The Product Name is: " + productName);
        System.out.println("The Brand is: " + brand);
        System.out.println("The Price is: " + price);
        System.out.println("The Skin Type is: " + skinType);
        System.out.println("The Weight is: " + weight);
        System.out.println("-------------------------------");
    }

    public void checkPrice() {
        if (price < 10) {
            System.out.println("The product is affordable.");
        } else {
            System.out.println("The product is expensive.");
        }
        System.out.println("-------------------------------");
    }

    public void checkSkinType(String skinType) {
        if (this.skinType.equalsIgnoreCase(skinType)) {
            System.out.println("Suitable for your skin type.");
        } else {
            System.out.println("Not suitable for your skin type.");
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

    public float calculateDiscount(float discountPercentage) {
        float discountedPrice = price - (price * (discountPercentage / 100));
        System.out.println("The discounted price is: " + discountedPrice);
        System.out.println("-------------------------------");
        return discountedPrice;
    }

    public String applyDiscount(float price, float discountPercentage) {
        float discountedPrice = calculateDiscount(discountPercentage);
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
