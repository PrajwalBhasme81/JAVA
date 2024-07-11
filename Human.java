public class Human
{
	public static void person()
	{
		String name = "Prajwal";
		System.out.println("The Name is :"+name);
	}
	
	public static void person(char gender)
	{
		System.out.println("The Gender is :"+gender);
	}
	
	public static void person(char gender, int age)
	{
		System.out.println("The Gender is :"+gender+"  "+"The Age is :"+age);
	}
	
	public static void person(char gender, int age, float height)
	{
		System.out.println("The Gender is :"+gender+"  "+"The Age is :"+age+"  "+"The Height is :"+height);
	}
	
	public static void person(char gender, int age, float height, double weight)
	{
		System.out.println("The Gender is :"+gender+"  "+"The Age is :"+age+"  "+"The Height is :"+height+"  "+"The Weight is :"+weight);
	}
	
	public static int person(char gender, int age, float height, double weight, int pcode)
	{
		System.out.println("The Gender is :"+gender+"  "+"The Age is :"+age+"  "+"The Height is :"+height+"  "+"The Weight is :"+weight+"  "+"The Person code is :"+pcode);
		return 0;
	}
	
	public static int person(char gender, float height, int age, double weight, int pcode)
	{
		System.out.println("The Gender is :"+gender+"  "+"The Age is :"+age+"  "+"The Height is :"+height+"  "+"The Weight is :"+weight+"  "+"The Person code is :"+pcode);
		return 0;
	}
	
	public static int person(char gender, int number_of_childrens, float height, int age, double weight, int pcode)
	{
		System.out.println("The Gender is :"+gender+"  "+"The Number of Childrens are :"+number_of_childrens+"  "+"The Age is :"+age+"  "+"The Height is :"+height+"  "+"The Weight is :"+weight+"  "+"The Person code is :"+pcode);
		return 0;
	}
}
