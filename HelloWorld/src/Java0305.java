

import java.io.*;

public class Java0305 
{
	public static void main(String[] args)throws IOException
	{
		PrintWriter outfile = new PrintWriter ("output3.txt");
		outfile.println();
		introduction(outfile);
		
	}
	
	public static void introduction(PrintWriter outfile)
	{
		outfile.println();
		return;	
	}
	
}

//	do{
//				body of the loop
//	  }while(condition);

// =input.next();
// =inout.nextLine();

// answer.charAt(0);
