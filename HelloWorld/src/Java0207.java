//Class note 0207 Intro to Java, Topic Formula
public class Java0207 
{
	public static void main(String[] args)
	{	
//	{
//		double wtf;
//		wtf=4;
//		wtf =Math.floor(5.9);
//		System.out.println(wtf);
//	}

// Math.pow
// Math.abs
// Math.ceil means fill the decimal to next integer
// math.floor means ignore the decimal and stay on the same decimal. 

//Char
// Notes that char x= 'b' this is only a single letter otherwise it generates a error;
/*	{
		char C = '5';
		char letter;
		letter= 'b';
		letter = C;
		letter++;
		if(letter!='b')
			System.out.println("letter is " +letter);
		else 
			System.out.println("Yes, its b");
		String word;
		word = "hello World";
		if(letter!='b')
			System.out.println(word);
		else
			System.out.println(C);
	}
*/	
		
//It's ok to convert int into double but it can't convert double into int
		double real_num, real_sum, x;
		int int_num, n;
		int_num=5;
		real_num=5.6;
		real_sum=int_num+real_num;
//		int_sum=int_num+real_num; //example of can't convert double into int
		n= int_num/2; //int n //This is convert int to double, and it will lose the decimal,
							  //However change the 2 to 2.0 will make it reminds on the same division.
		x= real_sum/2; //double x
		System.out.println(x+" "+n);
		
		
	}
}
//Types of error
//1.Compilation error
//Runtime Error
//Logic Error
//
