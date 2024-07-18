public class Recipe
{
	int i;
    public String name;
    public int servings;        
    public float prep_time;          
    public boolean is_vegetarian;       
    public float calories_per_serving;
    public String cuisine;
    public String author;
    public String publication_date;
    public String difficulty_level;
	public String[] ingredients;
	
	public Recipe()
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 0 Arguments");
	}
	
	public Recipe(String name)
	{
		this.name = name;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Recipe name is:"+name);
	}
	
	public Recipe(String name,int servings)
	{
		this.name = name;
		this.servings = servings;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 2 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
	}
	
	public Recipe(String name,int servings,float prep_time)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 3 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 4 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian,float calories_per_serving)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		this.calories_per_serving = calories_per_serving;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 5 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
		System.out.println("The Recipe calories_per_serving is:"+calories_per_serving);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian,float calories_per_serving,String cuisine)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		this.calories_per_serving = calories_per_serving;
		this.cuisine = cuisine;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 6 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
		System.out.println("The Recipe calories_per_serving is:"+calories_per_serving);
		System.out.println("The Recipe cuisine is:"+cuisine);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian,float calories_per_serving,String cuisine,String author)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		this.calories_per_serving = calories_per_serving;
		this.cuisine = cuisine;
		this.author = author;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 7 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
		System.out.println("The Recipe calories_per_serving is:"+calories_per_serving);
		System.out.println("The Recipe cuisine is:"+cuisine);
		System.out.println("The Recipe author is:"+author);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian,float calories_per_serving,String cuisine,String author,String publication_date)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		this.calories_per_serving = calories_per_serving;
		this.cuisine = cuisine;
		this.author = author;
		this.publication_date = publication_date;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 8 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
		System.out.println("The Recipe calories_per_serving is:"+calories_per_serving);
		System.out.println("The Recipe cuisine is:"+cuisine);
		System.out.println("The Recipe author is:"+author);
		System.out.println("The Recipe publication_date is:"+publication_date);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian,float calories_per_serving,String cuisine,String author,String publication_date,String difficulty_level)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		this.calories_per_serving = calories_per_serving;
		this.cuisine = cuisine;
		this.author = author;
		this.publication_date = publication_date;
		this.difficulty_level = difficulty_level;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 9 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
		System.out.println("The Recipe calories_per_serving is:"+calories_per_serving);
		System.out.println("The Recipe cuisine is:"+cuisine);
		System.out.println("The Recipe author is:"+author);
		System.out.println("The Recipe publication_date is:"+publication_date);
		System.out.println("The Recipe difficulty_level is:"+difficulty_level);
	}
	
	public Recipe(String name,int servings,float prep_time,boolean is_vegetarian,float calories_per_serving,String cuisine,String author,String publication_date,String difficulty_level,String[] ingredients)
	{
		this.name = name;
		this.servings = servings;
		this.prep_time = prep_time;
		this.is_vegetarian = is_vegetarian;
		this.calories_per_serving = calories_per_serving;
		this.cuisine = cuisine;
		this.author = author;
		this.publication_date = publication_date;
		this.difficulty_level = difficulty_level;
		this.ingredients = ingredients;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 10 Arguments");
		System.out.println("The Recipe name is:"+name);
		System.out.println("The Recipe servings is:"+servings);
		System.out.println("The Recipe prep_time is:"+prep_time);
		System.out.println("The Recipe is_vegetarian is:"+is_vegetarian);
		System.out.println("The Recipe calories_per_serving is:"+calories_per_serving);
		System.out.println("The Recipe cuisine is:"+cuisine);
		System.out.println("The Recipe author is:"+author);
		System.out.println("The Recipe publication_date is:"+publication_date);
		System.out.println("The Recipe difficulty_level is:"+difficulty_level);
		System.out.println("The Recipe ingredients is:"+ingredients[i]);
	}
}

