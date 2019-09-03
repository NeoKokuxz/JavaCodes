package BlazerFantasy;

import java.util.Scanner;

public class Main_menu {
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		String name = " "; 
		startDisplay();
		charName(name, input);
	}
	
	public static void startDisplay()
	{
		System.out.println("Welcome to blade world!");
		System.out.println("Wish you have a wonderful adventure!");
	}
	
	public static void charName(String name, Scanner input)
	{
		System.out.println("Please enter your name!");
		name = input.next();
		
	}
}
