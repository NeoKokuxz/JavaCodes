package Project1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringPile {

	public String shortest; 
	public String longest; 
	public ArrayList<String> inputs = new ArrayList<String>();
	int shortestL = 999999;
	int longestL = 0; 
	
	public void load(Scanner sc)
    {
    	//Loop all the inputs
    	while(sc.hasNextLine())
    	{
    		String x = sc.nextLine();
    		inputs.add(x);
    		getShortest(x);
    		getLongest(x);	
    	}
    }
    
    public String getShortest(String x)
    {
		String currentWord = x;
		int currentLength = x.length();
		if(shortestL > currentLength)
		{
			shortest = currentWord; 
			shortestL = currentLength;
		}
    	return x; 
    }
    
    public String getLongest(String y) 
    {
    	String currentWord = y;
    	int currentLength = y.length();
    	if(longestL < currentLength)
		{
			longest = currentWord; 
			longestL = currentLength;
		}
    	return y;
	}
    
    public void printInOrder(PrintStream ps)
    {
		Collections.sort(inputs);                                	 		
        for (String out: inputs) 
        {							
    		ps.println(out);
        }
    }
}
