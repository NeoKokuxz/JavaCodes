package Assignment;

import java.io.*;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) throws IOException
	{

		PrintWriter outFile;
		outFile= new PrintWriter("leagueTeam.txt");
		//Declare all the value that is needed for this program 
		char choice;
		int x, y, output;
		Scanner input = new Scanner(System.in);
		System.out.println("This is a simple calculator for basic functions!");	
		Display();
		do
		{
			System.out.println();
			System.out.println("Now enter your choice!");
			choice = input.next().charAt(0);
			outFile.print("Choice: " + choice + " ");
			System.out.println("Please enter your first integer!");
			x = input.nextInt();
			outFile.print(x + " ");
			System.out.println("Please enter your second integer!");
			y = input.nextInt();
			outFile.print(y + " ");
			output = menu(choice, x, y);
			outFile.println("result: " + output);
		}while(choice != 'Q');
		input.close();
		outFile.close();
	}
	public static void Display()
	{	
		System.out.println("+,-,*,/ or % for basic calculation");
		System.out.println("A for average 2 numbers");	
		System.out.println("X for max of 2 numbers");
		System.out.println("M for min of 2 numbers");
		System.out.println("S for square of a number (second one won't count!)");
		System.out.println("Q for quitting the program!"); 
	}
	public static int menu(char x, int i, int j)
	{		
		int result = 0;
		switch(x)
		{
			
			case '+':
				System.out.println("You entered +!");
				result = add2(i,j);
				System.out.println("The sum of them is " + result);
				break;
			case '-':
				System.out.println("You entered -!");
				result = less2(i,j);
				System.out.println("The difference of them is " + result);
				break;
			case '*':
				System.out.println("You entered *!");
				result = time2(i,j);
				System.out.println("The sum of them is " + result);
				break;
			case '/':
				System.out.println("You entered /!");
				result = dive2(i,j);
				System.out.println("The result of them is " + result);
				break;
			case '%':
				System.out.println("You entered %!");
				result = remind2(i,j);
				System.out.println("The reminder of them is " + result);
				break;
			case 'A':
				System.out.println("You entered A!");
				result = avg2(i,j);
				System.out.println("The avg of them is " + result);
				break;
			case 'X':
				System.out.println("You entered X!");
				result = Max2(i,j);
				System.out.println("The Max of them is " + result);
				break;
			case 'M':
				System.out.println("You entered M!");
				result = Min2(i,j);
				System.out.println("The Min of them is " + result);
				break;
			case 'S':
				System.out.println("You entered S!");
				result = Square(i,j);
				System.out.println("The square of " + i + " is " + result);
				break;
			case 'Q':
				Quit();
				break;
				
			//If choice doesn't match, print wrong statement
			default:
				System.out.println("Wrong! Re-enter your choice!");
				break;
		}
		return result;
	}

	public static int add2(int x, int y)
	{

		int sum = x + y;
		return sum;
	}
	
	public static int less2(int x, int y)
	{
		int sum = x - y;
		return sum;
	}
	
	public static int time2(int x, int y)
	{
		int sum = x * y;
		return sum;
	}
	
	public static int dive2(int x, int y)
	{
		int sum = x/y;
		return sum;
	}
	
	public static int remind2(int x, int y)
	{
		int sum = x%y;
		return sum;
	}
	
	public static int avg2(int x, int y)
	{
		int sum = (x+y) / 2;
		return sum;
	}
	
	public static int Max2(int x, int y)
	{
		int max;
		if(x > y)
		{
			max = x;
			return max;
		}
		else if( y > x)
		{
			max = y;
			return max;
		}
		else
			return x; 
	}
	
	public static int Min2(int x, int y)
	{
		int min;
		if(x > y)
		{
			min = y;
			return min;
		}
		else if( y < x)
		{
			min = x;
			return min;
		}
		else
			return x; 
	}
	
	public static int Square(int x, int y)
	{
		x *= x;
		return x; 
	}
	
	public static void Quit()
	{	
		System.out.println("The program is stopped!");
		return; 
	}
}

