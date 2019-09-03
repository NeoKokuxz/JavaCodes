//Sheng Chen CISC1115
//This is my program for compute the price of tickets and discount on price.

package Assignment;

import java.util.Scanner;

public class SpringCode 
{
	public static void main(String[] args)
	{	
		//declare all ints
		int a, s, c, oid, totalp, disQ, orderNum;
		double money, disAmount, totala;
		//initial all counters
		disQ = 0;
		orderNum = 0;
		totala = 0;
		totalp = 0;
		//Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your order number! Enter 0 to stop: ");
		oid = input.nextInt();
		//condition for program to stop != 0
		while(oid!=0)
		{
			//read in num of adult student and children
			System.out.print("Please enter adults: ");
			a = input.nextInt();
			System.out.print("Please enter students: ");
			s = input.nextInt();
			System.out.print("Please enter children: ");
			c = input.nextInt();
			//calculate total people, price and portion of adult
			totalp = a + s + c;
			money = a*5.00 + s * 3.50 + c * 2.50;
			totala = (double)a/totalp;
			System.out.println("The total is $"+ money);
			System.out.print("The order id " + oid + " has ");
			System.out.println("total of " + totalp + " peoples" );
			System.out.printf("total ticket sold to adults are "+"%2.2f", totala);
			System.out.println();
			//apply discount for 10 or more
			if(totalp >= 10)
			{
				disAmount = money - 8.50;
				System.out.println("Eligible for discount!");
				System.out.println("Discount = $8.50");
				System.out.println("The final price is "+ disAmount);
				disQ++;
				orderNum++;
			}
			else
			{	
				System.out.println("Not eligible for discount!");
				System.out.println("Discount = $0.00");
				System.out.println("The price is $" + money);
				orderNum++;
			}
			//keep the program going
			System.out.println("Order is processed!");
			System.out.println();
			System.out.println();
			System.out.print("Please enter next order number! Enter 0 to stop!: ");
			oid = input.nextInt();
		}
		//Total order num and how many discount orders
		System.out.println("Total of " + disQ + " orders qualified for discount!");
		System.out.println("There's total of " + orderNum + " orders");
	}//The end of main	
}
