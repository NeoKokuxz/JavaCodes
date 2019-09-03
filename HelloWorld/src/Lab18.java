import java.util.Scanner;

public class Lab18 {
	public static void main(String[] args)
	{	int count = 0;
		Scanner input = new Scanner("input.txt");
		while(input.hasNext())
		{
			String word1 = input.next();
			System.out.println(word1 + " " + word1.length());
			count++;
		}
		System.out.println(count);
		input.close();
		
	}
	
	public static String plus(String word)
	{
		int len = word.length();
		char lastLet = word.charAt(len - 1 );
		if( lastLet == 's' || lastLet == 'z')
				return (word + "es");
		else 
			return(word+"s");
	}
}

/*
String word1 = "black" ;
String word2 = word1; 
String word3 = input.nextLine();
String word4 = input.next();
String word5 = word1 + word2 ;
System.out.println(word1 + " " + word2 + " " +word3 + " " + word4 + " " + word5);
*/

//PS. nextLine reads in whit space while next only read in Characters. 