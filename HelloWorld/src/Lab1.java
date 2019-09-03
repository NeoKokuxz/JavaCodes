//Sheng Chen CISC1115 Lab1
//This is a lab to calculate the sqaure from 4 to 9
public class Lab1 
{
	public static void main (String[] args) 
	{
		System.out.println("Hello, here's a square tablef from 4 to 9");
		int num, sqa;
		num=4;
		for(int i=num; i<=9; i++)
		{
			sqa=i*i;
			System.out.println(i+"->"+sqa);
			System.out.println("Next");
		}
		System.out.println("Done");
	}
}