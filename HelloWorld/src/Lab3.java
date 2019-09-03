//Lab3 Sheng Chen
/*
public class Lab3 

{
	public static void main (String[] args)
	{
		System.out.println("This is a square root table from 1 to 10");
		double x,y;
		for(x=1;x<=100;x=x+0.5)
		{	
			y=Math.sqrt(x);
			System.out.printf("%6.2f %5.2f",x,y);
			System.out.println();
		}
		
	}
	
}

//Math.sqrt() is use for square root. 

*/ 
//This is a completed part 1 for Lab 3

public class Lab3 

{
	public static void main (String[] args)
	{
		System.out.println("This is a square root table from 1 to 10");
		double x,y;
		for(x=1;x<=100;x+=0.5)
		{
			y=Math.sqrt(x);
			System.out.printf("%6.2f %5.2f",x,y);
			System.out.println();
		}
		//this is how to print quote
		System.out.println("The\"king\"");
	}
	
}
//y= ((4*Math.pow(x,3))*(2*Math.pow(x, 2))-31*x-351) / (Math.sqrt(3*Math.pow(x,2)+1)+2*Math.abs(x-1.5));


//println(Toprintanewlinetype\\n\n)