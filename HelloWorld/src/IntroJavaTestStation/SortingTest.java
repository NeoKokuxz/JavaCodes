package IntroJavaTestStation;

public class SortingTest {
	
	public static void main(String[] args)
	{
		int array[] = {5,4,3,2,1,6,7};
		for(int i = 0; i<7; i++)
		{
			System.out.print( array[i]);
		}
		bubbleSort(array);
		System.out.println();
		for(int i = 0; i<7; i++)
		{
			System.out.print( array[i]);
		}
	}
	
	public static void bubbleSort(int[] numArray) 
	{
		
	    int n = numArray.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = 1; j < (n - i); j++) 
	        {

	            if (numArray[j - 1] > numArray[j]) 
	            {
	                temp = numArray[j - 1];
	                numArray[j - 1] = numArray[j];
	                numArray[j] = temp;
	            }

	        }
	    }
	}
}

	