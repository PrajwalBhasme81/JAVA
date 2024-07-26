public class ScienceRunner
{
	public static void main(String args[])
	{
		Science sub = new Science();
		System.out.println("Array Size is :"+sub.getArrLength());
		sub.getArrLength();
		System.out.println("--------Create-------");
		sub.createSubjectArray("Physics");
		sub.createSubjectArray("Chemistry");
		sub.createSubjectArray("Biology");
		sub.readSubjectArray();
		System.out.println("--------Update-------");
		String update = sub.updateSubjectArray("Biology","Mathematics");
		System.out.println(update);
		sub.readSubjectArray();
		System.out.println("--------Delete-------");
		String delete = sub.deleteSubjectArray("Chemistry");
		System.out.println(delete);
		sub.readSubjectArray();
		System.out.println("--------Search-------");
		String search = sub.searchSubjectArray("Chemistry");
		System.out.println(search);
		sub.readSubjectArray();
	}
}
		