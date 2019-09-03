//Sheng Chen Assignment4 
//THis program will read in all 3 SAT scores and judge by the score to see if it's valid or not
//Only process when it's valid and rate their scores.
package Assignment;

import java.util.Scanner;

public class Assignment4 
{
	public static void main(String[] args)
	{	int x,y,z, valid, invalid;
		valid = 0 ;
		invalid = 0;
		System.out.println("This is the program for Assignment 4 that represent SAT score! All 0/0/0 to stop!");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first SAT score!");
		x = input.nextInt();
		System.out.println("Please enter your second SAT score!");
		y = input.nextInt();
		System.out.println("Please enter your third SAT score!");
		z = input.nextInt();
		while( x > 0 || y>0 || z > 0 )
		{	
			boolean value = isitavalidgroup(x,y,z);
			if( value)
			{
			
				System.out.println("This is a valid group!");
				valid++;
				classify(x, y ,z);
				System.out.println();
				System.out.println();
				System.out.println("Please enter your next SAT score! ALL 0/0/0 to stop!");
				System.out.println();
				System.out.println("Please enter your first SAT score!");
				x = input.nextInt();
				System.out.println("Please enter your second SAT score!");
				y = input.nextInt();
				System.out.println("Please enter your third SAT score!");
				z = input.nextInt();
			}
		
			else if(!value){
				System.out.println("This is not a valid group!");
			 	invalid++;
				System.out.println();
				System.out.println();
				System.out.println("Please enter your next SAT score!");
				System.out.println();
				System.out.println("Please enter your first SAT score!");
				x = input.nextInt();
				System.out.println("Please enter your second SAT score!");
				y = input.nextInt();
				System.out.println("Please enter your third SAT score!");
				z = input.nextInt();
			}
		}
		System.out.println("There is " + valid + " valid groups!");
		System.out.println("There is " + invalid + " invalid groups");
	}//The end of main
		
	
	
	public static boolean isitavalidgroup(int x, int y, int z)
	{	
		if(x<=800 && x>=200 && y<=800 && y>=200 && z<=800 && z>=200)
		{
			if(x%10==0 && y%10==0 && z%10==0)
			return true;
		}
		else
		return false;
		return false;
	}
	public static void classify(int x, int y, int z)
	{	
		System.out.println( "The first SAT score is " + x);
		ratesonescore(x);
		System.out.println( "The second SAT score is " + y);
		ratesonescore(y);
		System.out.println( "The third SAT score is " + z);
		ratesonescore(z);
		ratethegroup(x,y,z, findtotalscore(x,y,z) );
		System.out.println("Totatl SAT score is " + findtotalscore(x,y,z));
		return;
	}
	
	public static int findtotalscore(int x, int y, int z)
	{
		int sum;
		sum = x + y + z;
		return sum;
	}
	public static int ratesonescore(int x)
	{	
		if(x==800)
		{
			System.out.println("800! Perfect Score");
		}
		else if(x>=500)
		{
			System.out.println("500 and above!");
		}
		else
			System.out.println("Less than 500");
		return x;
	}

	public static void ratethegroup(int x, int y, int z, int s)
	{
		if(s >= 2100)
		{
			if(x >= 700 & y >= 700 & z >= 700)
			{
				System.out.println("Outstanding!");
			}
			else if(x >= 700 & y >= 700 && x >= 700 & z >= 700 && y >= 700 & z >= 700)
			{
				System.out.println("Very good!");
			}
			else
			{
				System.out.println("Lopsided!");
			}
			return;
		}
		else if(x < 2100)
		{
			if(x < 500 & y < 500 & z < 500)
			{
				System.out.println("Weak!");
			}
			else
				System.out.println("Erratic");
		}
	}
	
}
