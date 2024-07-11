public class BikeRunner
{
	public static void main(String[] args)
	{
		Bike.bikeName = "Royal Enfield";
		Bike.price = 250000;
		Bike.rating = 5.0f;
		Bike.numberOfColors = 4;
		Bike.weight = "175Kg";
		
		System.out.println("The Bike Name is:"+Bike.bikeName);
		System.out.println("The Bike Price is:"+Bike.price);
		System.out.println("The Bike Rating is:"+Bike.rating);
		System.out.println("The Number Of Colors are:"+Bike.numberOfColors);
		System.out.println("The Bike Weight is:"+Bike.weight);
	}
}