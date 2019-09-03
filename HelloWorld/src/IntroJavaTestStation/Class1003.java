package IntroJavaTestStation;

import java.util.ArrayList;
import java.util.Scanner;

public class Class1003 {
	public static void main(String[] args)
	{	
		
		Scanner sc = new Scanner (System.in);
		
		while(sc.hasNext())
		{
		String i = sc.next();
		ArrayList <String> myList = new ArrayList<String>() ;
		myList.add(i);
		int size = myList.size();
		System.out.print(size + " " + i);
		System.out.print (" =  " +(myList));
		
		} 
	}
}
