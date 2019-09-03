import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReadInFiles {

	
	public static void main(String[] args)throws IOException
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input file name:");
		String f = input.nextLine();
		File file = new File(f);
		Scanner infile = new Scanner(file);

		String num = infile.nextLine();
		//infile.nextLine();
		System.out.println("Number read is " + num);
		infile.close();
		input.close();
	}
}
