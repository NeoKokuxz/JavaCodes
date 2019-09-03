import java.util.Scanner;


public class Lab10 
{
	public static void main(String[] args)
	{	int num, sqaNum;
		System.out.println("You are in the main program now!");
		do
		{	
			Scanner input = new Scanner (System.in);
			System.out.println("Enter a number you want! Enter 0 to stop!");
			num = input.nextInt();
			sqaNum =square(num);
			System.out.println("Your number"+num+ " square is "+ sqaNum );
		}while(num!=0);
	}
	
	public static int square(int x)
	{
		return x*x;
	}
}
