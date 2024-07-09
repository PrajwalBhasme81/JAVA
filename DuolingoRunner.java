public class DuolingoRunner
{
	public static void main(String args[])
	{
		Duolingo.Application();
		Duolingo.Application("Learning App", 46);
		Duolingo.Application(4.3f);
		String languages[] = {"Kannada","English","Hindi","French","Marati"};
		Duolingo.Application(languages);
	}
}