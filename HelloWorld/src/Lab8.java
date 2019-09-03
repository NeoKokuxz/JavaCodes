//Lab 8 about programer-defined methods
import java.util.Scanner;

public class Lab8 
{
	public static void main(String[] args)
	{
		double x,y,z,num;
		int num1;
		x=50;
		y= cube(x);
		z= sign(y);
		System.out.println("y is "+y+" x is "+z);
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number");
		num=input.nextDouble();
		num1= sign(num);
		System.out.print(num1);
		
		
	}
			
	public static double cube(double n)
	{
			return n*n*n;
	}
		
	public static int sign(double p)
	{
			if(p>100)
				return 1;
			if(p<100)
				return 0;
			if(p==100)
				return -1;
			return 50;
	}
	
}
