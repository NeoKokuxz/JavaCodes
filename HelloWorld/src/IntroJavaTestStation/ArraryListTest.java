package IntroJavaTestStation;

import java.util.ArrayList;

public class ArraryListTest {
	public static void main(String[] args)
	{
		ArrayList <String> myList = new ArrayList<String>() ;
		String x = new String("Wooooowww");
		myList.add(x);
		String y = new String("xD");
		myList.add(y);
		int size = myList.size();
		boolean isIn = myList.contains(x);
		int idy = myList.indexOf(y);
		boolean empty = myList.isEmpty();
		myList.remove(y);
		System.out.println(myList.contains(x));
		System.out.println("The y is " + isIn);
		int[] array = { 1,2,3,4,5};
		for(int i:array)
		{
			i = i + 1;
			System.out.print(i + " ");
		}
		for(int j = 0; j< array.length; j++){
			array[j] = array[j] + 1;
		}
		System.out.println();
		for(int i:array)
		{
			System.out.print(i  + " ");
		}
		int sum = 0;
		int[] array1 = {1,2,3,4,5};
		for(int i:array1)
		{
			sum += i;
		}
		System.out.println();
		System.out.println(sum);
		int[] array2 = {};
		System.out.println(myList.get(0));

	}
}
