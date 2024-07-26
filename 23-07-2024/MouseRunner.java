public class MouseRunner
{
	public static void main(String[] args) {
        // Creating an instance using no-argument constructor
        Mouse mouse1 = new Mouse();

        // Creating an instance using parameterized constructor
        Mouse mouse2 = new Mouse("ModelX", "BrandA", 25.99, 1600, true);

        // Invoking methods
        mouse2.checkPrice();
        mouse2.checkDpi(1200);
        mouse2.matchBrand("BrandA");
        mouse2.calculateDiscount(10);
        mouse2.applyDiscount(10);
    }
}