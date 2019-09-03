package IntroJavaTestStation;

public class TestSrc 
{
	public static void main(String[] args)
	{	
		int x,y,z;
		x=6;
		y=18;
		z=4;
		while(x%z!=0)
		{
			x+=1;
		}	
		if(x%z==0)
			{
				y=x+4;
				z=y+4;
			}
		System.out.println(x+" "+y+ " "+z);
		
	//	for(int i=1; i<=10; i++)
	//	{
	//		System.out.println((int)(Math.random()*25+1));
	//	}
	/*	
		int a=0;
		String name;
		char b = 'A';
		System.out.print(b);
	*/
	}
}
