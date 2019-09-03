
// Class notes Java 0214 Happy valentines day lmao


import java.util.Scanner;
public class Java0214 
{
	public static void main(String[] args)
	{
		int pow;
		pow=1;
		
		while(pow<=1)
		{
			System.out.println(pow);
			pow++;
			
		}
		int n, x;
		x=1;
		n=0;
		while(n!=3)
		{
			x*=2;
			n++;
		}
		System.out.println(x);
		
		//Scanner class imported and applied it in code
		Scanner input = new Scanner (System.in);
		int id;
		double pay,hours,rate;
		System.out.println("Please enter your ID number");
		id=input.nextInt();
		System.out.println("Your ID number is " +id);
		while(id!=0 &&true)
		{
		
		System.out.println("Please enter your hours");
		hours=input.nextDouble();
		System.out.println("Please enter your rates");
		rate=input.nextDouble();
		pay= hours*rate;
		System.out.println("ID number is "+id+ " worked "+ hours+" hours"+" under rate "
							+ rate +"and the netpay is $"+pay);
//		System.out.println("Would you like to stop ? Y or N");
		}
		
	}
}

// Scanner have to be import from java.util.Scanner;
// Scanner commands: nextInt (take next integer) nextDouble, nextFloat,
// nextLine, next these two used for string  


