package CISC3115;

import java.util.Scanner;

public class Ex0 {
	
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner (System.in);
		char next = 'N';
		do
		{
		System.out.println("Please enter 2 numbers");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double sum = 0 ;
		if(num1 == Math.floor(num1) && num2 == Math.floor(num2))
		{
			int newSum = (int) (num1 + num2);
			int x = (int) (num1);
			int y = (int) (num2);
			System.out.println(x + " + " + y + " = " + newSum);
		}
		else if (num1 == Math.floor(num1) && num2 != Math.floor(num2))
		{
			int x = (int) (num1);
			double newSum = (double) (num1 + num2);
			System.out.println(x + " + " + num2 + " = " + newSum);
		}
		else if(num1 != Math.floor(num1) && num2 == Math.floor(num2))
		{
			int y = (int) (num2);
			double newSum = (double) (num1 + num2);
			System.out.println(num1 + " + " + y + " = " + newSum);
		}
		else
		{
			sum = (double)(num1 + num2);
			System.out.println(num1 + " + " + num2 + " = " + sum);
		}
		System.out.println("Do you want to continue? Y/N");
		next = sc.next().charAt(0); //Using charAt to check the position of the condition
		}while(next == 'Y' || next == 'y');
		
	}
}


