import java.util.Scanner;


public class Lab6 
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner (System.in);
		int number;
		System.out.println( "Please type in a value");
		number=input.nextInt();
		System.out.println("you typed in "+number);
		if(number>5)
			{
				System.out.println("The value is larger than 5");
			}
		if(number<5)
			{
				System.out.println("The value is smaller than 5");
			}
	}
}
