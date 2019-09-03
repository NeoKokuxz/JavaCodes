//Sheng Chen Intro to Java A6
package Assignment;

import java.util.Scanner;
import java.io.*;

public class Assignment6 
{
	public static void main(String[] args)throws IOException
	{	
		//PW
		PrintWriter outFile;
		//outFile
		outFile = new PrintWriter("A6output.txt");
		//Initial array and declare ints
		int[] score1 = new int[50];
		int[] score2 = new int[50];
		int[] sumScore = new int[50];
		int lim = 0;
		int xs = 1000;
		int sNum1, sNum2, sNum3;
		int k = 0;
		//Read in file A6
	    File file = new File("A6.txt");
	    //Scanner for file input
		Scanner infile = new Scanner (file);
		int n = infile.nextInt();
		//Read in data into 2 arrays
		readData(n, score1, score2, infile, file);
		//Print arrays
		System.out.println("This is score1");
		outFile.println("This is score1");
	    printArray(lim, score1, outFile, n);
		System.out.println("This is score2");
		outFile.println("This is score2");
		printArray(lim, score2, outFile, n);
		//Find the smallest number in both arrays
	    sNum1 = smallest(xs, score1, n);
		sNum2 = smallest(xs, score2, n);
		//Construct method
		construct(k, score1, score2, sumScore, n, outFile, file);
		sNum3 = smallest(xs, sumScore, n);
		System.out.println("The smallest number for score1 is" + sNum1);
		outFile.println("The smallest number for score1 is" + sNum1);
		System.out.println("The smallest number for score2 is" + sNum2);
		outFile.println("The smallest number for score2 is" + sNum2);
		System.out.println("The smallest number for sum array is" + sNum3);
		outFile.println("The smallest number for sum array is" + sNum3);
		//whatshigher method
		whatsHigher(n, score1, score2, outFile);
		System.out.println("This is the end of program!");
		//Close infile scanner and outfile. 
		infile.close();
		outFile.close();
	}//End of main


	public static void readData(int n, int[] nums1, int[] nums2, Scanner infile, File file)
	{	
		

		for(int i=0; i<n; i++)
		{
			nums1[i] = infile.nextInt();
		//	System.out.print(nums1[i] + " ");
			nums2[i] = infile.nextInt();
		//	System.out.print(nums2[i] + " ");
		//	System.out.println();
		}
		return;
	}
	
	public static void printArray(int lim, int[] val, PrintWriter outFile, int n)
	{
		int couter = 0;
		for(int i=0; i< n; i++ )
		{
			lim = val[i]; 
			System.out.print(lim+ " ");;
			outFile.print(lim +" ");
			couter++;
		}
		outFile.println();
		System.out.println();
		System.out.println("There is " + couter + " numbers in This array");
		return;
	}

	public static int smallest(int num, int[] arr, int n)
	{
		int temp;
		for(int j=0; j <n; j++)
		{
			temp = arr[j];
			if(num >= temp)
			{
				num = temp;
			}
		}
		return num;
	}

	public static void construct(int k, int[] old1, int[] old2, int[] sumarr, int n, PrintWriter outFile, File file)
	{
		System.out.println("The sum of both array is");
		outFile.println("The sum of both array is");
		for(int x = 0; x <n ; x++)
		{
			sumarr[x] = old1[x] + old2[x];
			k = sumarr[x];
			System.out.print(k + " ");
			outFile.print(k + " ");
		}
		System.out.println();
		outFile.println();
		return;
	}
	
	public static void whatsHigher(int n, int[] score1, int[] score2, PrintWriter outFile)
	{
		System.out.println();
		int x,y, pos;
		int couter1 =0; 
		int couter2 =0;
		int couter3 =0;
		for(int i = 0; i < n; i++)
		{
			pos = i;
			x = score1[i];
			y = score2[i];
			if( score1[i] > score2[i])
			{

				System.out.println("In position " + pos + " the higher value is"
						+ "array score1: " + x + " is higher than " + y);
				couter1++;
			}
			else if( score2[i] > score1[i])
			{
				System.out.println("In position " + pos + " the higher value is"
						+ "array score2: " + y + " is higher than " + x);
				couter2++;
			}
			else
			{
				System.out.println("In position " + pos + " has the same value as"
						+ "array score2: " + y + " is same as " + x);
				couter3++;
			}
		}

		outFile.println();
		System.out.println("The array 1 is higher: " + couter1 + " times");
		outFile.println("The array 1 is higher: " + couter1 + " times");
		System.out.println("The array 2 is higher: " + couter2 + " times");
		outFile.println("The array 2 is higher: " + couter2 + " times");
		System.out.println("both arrays are the same: " + couter3 + " times");
		outFile.println("both arrays are the same: " + couter3 + " times");
		return;
	}	
}