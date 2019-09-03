//About array
public class Java0328 {
	public static void main(String[] args)
	{
		int[] array = new int [10];
		array [4]= 7;
		array [0]=-7;
		array [2]= 6;
		
		for(int i=0; i<7; i++)
			array [i]+=1;
		for(int j=0; j<7; j++)
			array[j]=0;	
	}
}
