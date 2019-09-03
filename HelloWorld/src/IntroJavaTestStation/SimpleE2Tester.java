package IntroJavaTestStation;

public class SimpleE2Tester {

	public static void main(String[] args)
	{
		int count =0;
		String course = "CISC 1115",
			   instructor = "Ettinger";
		StringBuilder newWord = new StringBuilder(course);
		int x,y;
		System.out.println(instructor.substring(2,6));
		for(int i=0; i< instructor.length(); i++)
		{
			if(Character.isDigit(instructor.charAt(i)));
			{
				count++;
				System.out.print(instructor.charAt(i));
			}
		}
		System.out.println(count);
		System.out.println(instructor.charAt(0));
	}
}