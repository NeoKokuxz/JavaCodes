//Sheng Chen 	Spring 2018 	CISC1115
//Assignment 1 due Feb 21, 
package Assignment;

public class Assignment1 
{
	public static void main(String[] args)
	{
		System.out.println("My name is Sheng Chen");
		System.out.println("Here is the out put of my program");
		double x, y, closeNum, currNum, priX;
		int p,n,z,outX;
		z=0;
		n=0;
		p=0;
		closeNum=1000;
		currNum=0;
		outX=0;
		priX=-3.0;
		System.out.println("X\tY");
		for(x= -3.0; x<=3.0; x+=0.5)
		{	
			//equations
			y= ((4*Math.pow(x,3))+(8*Math.pow(x, 2))-31*x-35) 
					/ (Math.sqrt((3*Math.pow(x,2))+1)+(2*Math.abs(x-1.5)));
			
			//assign the current number to Y in abs value
			currNum=Math.abs(y);
			System.out.printf("X="+ "%5.1f",x);
			System.out.printf("\tY="+ "%6.2f",y);
			//extra credit for checking the number closest to 0
			if(y!=0)
			 {
				if(currNum < closeNum)
					closeNum=currNum;
					if(closeNum==currNum)
						outX++;
			 }	
				//if statements for Y value to Zero P or N
				if(y==0)
				{
					System.out.print(" ->Y is Zero");
					System.out.println();
					z++;
				}
				if(y>0)
				{
					System.out.print(" ->Y is Positive");
					System.out.println();
					p++;
					
				}
				if(y<0)
				{
					System.out.print(" ->Y is Negative");
					System.out.println();
					n++;
				}
			System.out.println();
		}
		//string the counts of each Y value
		System.out.println("Y is Positive ->" + p + " times");
		System.out.println("Y is Negative ->" + n + " times");
		System.out.println("Y is Zero     ->" + z + " times");
		priX= -3 + 0.5* outX - 0.5;
		//print out the one closest to Y
		System.out.printf("The Y value closest to Zero is" +"%5.2f ",closeNum);
		//print out the X value that produce the one closest to 0;
		System.out.printf("and it's X value is"+ "%5.1f", priX);
		System.out.println();
		//The end
		System.out.println("Finished, this is my frist Java program");
	}
}



