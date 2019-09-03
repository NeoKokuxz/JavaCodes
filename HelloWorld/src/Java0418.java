
public class Java0418 {
	public static void main(int[]a, int n)
	{
		for(int pass = 0; pass < n -1; pass ++)
		{
			for(int card = pass+ 1; card < n; card++)
			{
				if( a[card]< a[pass]);
				 int temp = a[card];
				 a[card] = a[pass];
				 a[pass] = temp;
			}
		}
	}
	public static void stk (String[] args)
	{
		
	}
}

// temp = a;
// a = b;
// b = temp;
//

