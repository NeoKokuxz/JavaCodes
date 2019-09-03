package Assignment;

import java.io.*;
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) throws IOException
	{
		File file = new File("A7.txt");
		File sfile = new File("A7S.txt");
		Scanner infile = new Scanner(file);
		String password = infile.next();
		String newPs;
		int n = 0;
		System.out.println("This is part 1 of the program");
		while(infile.hasNext())
		{
			if(check(password) != false)
			{
				newPs = password;
				System.out.println(newPs);
				password = infile.next();	
				n++;
			}
			else
			password = infile.next();	
		}
		System.out.println("There's: "+ n + " verified password");
		System.out.println("This is part 2 of the program");
		Scanner sinfile = new Scanner(sfile);
		while(sinfile.hasNextLine())
		{
			String sentence = sinfile.nextLine();
			System.out.println("The original sentence is "+sentence);
			convert(sentence);
		}
		infile.close();
	}

	public static boolean check (String a)
	{
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		
		if(a.length()<8)
		{
			return false; 
		}
		
		for(int i=0; i<a.length(); i++)
		{
			if(Character.isUpperCase(a.charAt(i)))
			{
				hasUpper = true;
			}
			else if(Character.isLowerCase(a.charAt(i)))
			{
				hasLower = true;
			}
			else if(Character.isDigit(a.charAt(i)))
			{
				hasDigit = true;
			}
					
		}
		if(hasUpper == true && hasLower == true && hasDigit == true);
		{
			return true;
		}
		
	}

	public static void convert(String b)
	{
		StringBuilder cons = new StringBuilder(b);
		String editedS;
		for(int i=1; i<b.length(); i++)
		{
			if(Character.isUpperCase(cons.charAt(i)))
			{
				editedS = Character.toString(Character.toLowerCase(cons.charAt(i)));
				cons.replace(i,i+1,editedS);
				cons.insert(i, ' ');
			}
		}
			if(cons.lastIndexOf(".", b.length()) ==-1)
				{
					cons.append('.');
				}
			
			System.out.println("The converted sentence is "+cons);
			System.out.println();
	}
		
	
}
