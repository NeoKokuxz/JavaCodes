package IntroJavaTestStation;

public class A4Test {
	public static void main(String[] args)
	{
		int x= 5, y=6, z=7;
		int sumS;
		sumS = sumTotal(x,y,z);
		System.out.println(sumS);
		test();
	}
	public static int sumTotal(int x, int y, int z)
	{
		int sum;
		sum= x+y+z;
		return sum;
	}
	public static void test()
	{
		char c = 'A';
		Character.isUpperCase(c);
		System.out.println(Character.isUpperCase(c));
		
	}
}

/*
boolean p = false;
int startPos, endPos;
String splitS = b.substring(0,1);
for(int i = 0; i< b.length(); i++)
{
	while(Character.isUpperCase(b.charAt(i)) != true);
	{
		startPos = i;
		endPos = i+1;
		p = true;
	
		if(p==true)
		{
			splitS = b.substring(startPos, endPos);
			System.out.print(startPos+ " ");
			System.out.println(splitS);
		}
	}
*/