package CISC3115;

import java.util.Scanner;

public class Fn 
{
	public static void main(String[] args)
	{
		int[] array1 = new int[10000];
		int[] array2 = new int[10000];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number 1-9999");
		int n = input.nextInt();
		while(n!=0)
		{   
			if( n <= 9999)
				{
				sumArray(array1, array2, n);
				}
			else
				
					System.out.println("Please enter your number 1-9999");
					n = input.nextInt();
				
		}
		

	}
	public static void sumArray(int[] array1, int array2[], int n)
	{
		int f1 = 1, f2 = 1;
		int fn =2;
		array1[0] = f1;
		array1[1] = f2;
		for(int i=0; i<n; i++)
		{
			int temp = array1[0] + array1[1];
			array1[0] = array1[1];
			array1[1] = temp;
			pri(temp);
			System.out.println();
		}
		
	}
	public static void pri(int array1)
	{
		System.out.print(array1 + " ");
	}
}
