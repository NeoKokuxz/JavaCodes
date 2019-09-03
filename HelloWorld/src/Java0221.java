import java.util.Scanner;

//ClaseNotes
public class Java0221 
{
	public static void main(String[] args)
	{
		
		final double QI= (double) 22/7;
		System.out.println(QI);
		for(int i=1; i<=QI; i++)
			System.out.println(i);
		
		int randNum;
		randNum=(int)(Math.random()*101);
		System.out.println("Take a guess");
		Scanner input = new Scanner (System.in);
		int guess = input.nextInt();
		int numGuesses=1;
		while(guess!=randNum)
		{
			if(guess < randNum)
			{
				System.out.println("Guess is too low");
				numGuesses++;
				guess = input.nextInt();
			}
			else
			{
				System.out.println("Guess is too high");
				numGuesses++;
				guess = input.nextInt();
			}
		}
		System.out.println("You got it right!");
		System.out.println("You guessed " +numGuesses + " times");	
	}
}

//stepwise implement 
// sum of the square from 1-29+30^2  (from 1-30)
// for(x=1; x<=30; x++)
// sum += x*x; (source code)


//final will make it as final can't change

//Math.random will generate a random number 0-1
// example: 
// double num
// num= math.random() *10;
//or force it to be a int
// int num
// num= (int) (math.random()*10)+1; <<< from 1-10
//for dice 						 v-lo 
// num = (int) (math.random()*6)+1 <<< from 1-6
//                            ^high-low+1
//							from 1-6 >>> 6-1+1 
//							from 5-20 >>> 20-5+1 >>> 16
//							from 1-100 >>> 100
//							from 0-100 >>> 101
