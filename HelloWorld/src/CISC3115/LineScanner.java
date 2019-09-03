package CISC3115;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineScanner {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner fs = new Scanner (new File("Linedata.txt"));
		int lines = 0; 
		int intC = 0;
		while(fs.hasNextLine())
		{
			String line = fs.nextLine();
			Scanner lineScanner = new Scanner (line);
			while(lineScanner.hasNext())
			{
				lineScanner.nextInt();
				intC ++ ; 
			}
			lines++ ; 
			System.out.println(line);
			System.out.println("There is " + intC + " ints and " + lines + " lines"  );
			intC = 0;	
		}
	}
}
