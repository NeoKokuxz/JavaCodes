package Project1;

import java.util.Scanner;

public class PileTimer 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringPile sp = new StringPile(); 
		//Count start time
		long startTime = System.nanoTime();
		//Pass scanner
		sp.load(sc);
		//Print out shortest and longest
		System.out.println(sp.shortest);
		System.out.println(sp.longest);
		sp.printInOrder(System.out);
		//count end time and difference
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("Execution time in milliseconds : " + 
								timeElapsed / 1000000);
		sc.close();
	}
}
