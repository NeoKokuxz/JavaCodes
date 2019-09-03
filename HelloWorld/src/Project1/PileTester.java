package Project1;

import java.util.Scanner;

public class PileTester {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringPile sp = new StringPile(); 
		//Pass scanner to load
		sp.load(sc);
		//Print out shortest and longest
		System.out.println(sp.shortest);
		System.out.println(sp.longest);
		//Printout in order
		sp.printInOrder(System.out);
		sc.close();
	}
}
