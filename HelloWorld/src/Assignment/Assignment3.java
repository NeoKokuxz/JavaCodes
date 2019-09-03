//Sheng Chen Assignment 3 Due March 14!

package Assignment;

import java.util.Scanner;

public class Assignment3 
{
	public static void main(String[] args)
	{	
		introduction();
		Scanner input = new Scanner (System.in);
		int n = 0;
		int num= 0;
		System.out.println("Please enter a value for N! Enter 99 to stop!");
		n = input.nextInt();
		while(n!=99)
		{	
			if(n>=0)	
			{
					printN(n);
					isiteven(n);
					num++;
					System.out.println();
					System.out.println("Please enter a  new value for N! Enter 99 to stop!");
					n = input.nextInt();
			}
			else
			{		
					System.out.println("Negative is no good! N<=0!");
					System.out.println();
					System.out.println("Please Retype a value for N! Enter 99 to stop!");
					n = input.nextInt();
			}	
		}	

		System.out.println("System stopped!");
		System.out.println("Total number of "+ num+ " datas processed");	
	}//The end of main
	
	//void will not return value, only print the message to main whenever its called
	public static void introduction()
	{
		System.out.println("This is a program that computes the Even and Odd number");
		System.out.println("and sum up the square for even and the numbers for odd");
		System.out.println();
	}
	
	//method receive int value for N, this will print the number that is entered
	public static int printN (int x)
	{
		System.out.println("You entered number " + x);
		return x;
	}
	
	//void for check number if its even, not return value, only print the message at first
	//then pass the int value from main to sumEven or sumOdd for further computation. 
	public static void isiteven (int x)
	{	
		if(x%2==0)
		{
			System.out.println("This is a even number!");
			sumEvenSquares(x);
		}
		else
		{
			System.out.println("This is a odd number!");
			sumOddNumber(x);
		}
		return;
	}
	
	//method receive int, sumEvenMethod will compute sum of the even number entered
	public static int sumEvenSquares(int x)
	{
		int sum, evenValue;
		sum=0;
		System.out.print("The first "+x+ " even number is ");
		for(int i=1; i<= x; i++)
		{
			evenValue = 2*i;
			System.out.print(evenValue+ " ");
			sum += (evenValue*evenValue);
		}
		System.out.println("The sum of them is "+sum);
		return x;
	}

	//method receive int, sumoddMethod will compute the sum of the odd number entered
	public static int sumOddNumber(int x)
	{
		int sum, oddValue;
		sum=0;
		System.out.print("The first "+x+ " odd number is ");
		for(int i=1; i <= x; i++)
		{
			oddValue = (i-1)*2 +1;
			System.out.print(oddValue+ " ");
			sum += oddValue;
		}
		System.out.println("The sum of them is "+sum);
		return x;
	}
}
