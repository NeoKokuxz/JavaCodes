
public class Midterm {
		public static void main (String args[])
		{
		     int a = 1, b = 4, c = 5;
		     double x = 3.0;

		     a = newone(b,x);
		     System.out.println( "first: " + a + " " + b
		          + " " + c);

		     a = 4;
		     b = 10;
		     c = newone(b - a, 10);

		     System.out.println( "then: " + c);
		}

		public static int newone(int t, double v)
		{
		      int w;

		      if (v > 5.0)
		           w = t * 2;
		        else
		            w = t / 2 + 3;

		      System.out.println( "w is now: " + w);
		      return w + 10;
		}
		
}
