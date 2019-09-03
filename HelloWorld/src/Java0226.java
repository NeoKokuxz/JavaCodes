//Classnote of Feb 26
//Nested Loop

public class Java0226 
{
	public static void main(String[] args)
	{
		int m1,m2;
		System.out.printf("%3S", "X");
		for(m2=1; m2<=10; m2++)
			System.out.printf("%5d",m2);
		System.out.println();
		System.out.println();
		System.out.println();
		for(m1=1; m1<=10; m1++)
			{
				System.out.printf("%3d",m1);
				for(m2=1; m2<=10; m2++)
					System.out.printf("%5d", m1*m2);
					System.out.println();
					System.out.println();
					System.out.println();
			}
		
		double x,y,z;
		x=16.0;
		y=Math.sqrt(x);
		z=cube(x*2);
		System.out.println(cube(x)+" "+y+" "+z);
		
	}
	public static double cube(double p)
	{
		return p*p*p;
	}
	public static int sign (double n)
	{
		if(n>0)
			return 1;
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		return 0;
	}
}

//March 12th, Java Exam. 7th is the review section.
