import java.util.Scanner;


public class Lab4 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in) ;
		
		int number;
		
		System.out.println("Please enter the number");
		
		number=input.nextInt();
		
		System.out.println("Yout enter " +number);
		
		while(number!=0)
		{
			System.out.println("Please enter new number! 0 to stop");
			number=input.nextInt();
			if(number!=0)
				System.out.println("Your enter "+number);
		}
		System.out.println("You enter 0! Program stop!");
	}

}
