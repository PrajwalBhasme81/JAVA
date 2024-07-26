public class CosmeticRunner 
{
    public static void main(String[] args) 
	{
        Cosmetic cosmetic1 = new Cosmetic();

        String[] exampleSkills = {"Java", "Python"};
        Cosmetic cosmetic2 = new Cosmetic("Lipstick", "BrandA", 15.99f, "Oily", 5.0f);

        cosmetic2.checkPrice();
        cosmetic2.checkSkinType("Oily");
        cosmetic2.matchBrand("BrandA");
        cosmetic2.calculateDiscount(10);
        cosmetic2.applyDiscount(15.99f, 10);
    }
}