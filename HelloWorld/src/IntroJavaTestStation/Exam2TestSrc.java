package IntroJavaTestStation;

import java.util.Scanner;

public class Exam2TestSrc {

	public static void main(String[] args)
	{
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter ur name!");
		name = input.nextLine();
		System.out.println("Your name is "+name);
		String inits = monogram2(name);
		inits = inits.toUpperCase();
		System.out.println( inits);
		input.close();
	}
	
	public static String monogram2(String name)
	{
		int p = name.indexOf(" ", 0);
		String inits = name.substring(0, 1);
		while( p>=0)
		{
			inits += name.charAt(p+1);
			p = inits.indexOf(" ", p+1);
		}
		return inits;
	}
}
