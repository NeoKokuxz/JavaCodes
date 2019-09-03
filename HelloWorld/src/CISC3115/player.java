package CISC3115;

public class player {
	

	int number = 0;

	public void guess()
	{
		
		number = (int)(Math.random()*10);
		System.out.println("The guess number is " + number);
	}
	
}
