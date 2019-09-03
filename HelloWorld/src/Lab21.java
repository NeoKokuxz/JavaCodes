
public class Lab21 {
	public static void main(String[] args)
	{
		String S1 = "Animal";
		String S2 = "Angry";
		String S3 = "America";
		StringBuilder zb1 = new StringBuilder("Zelda");
		System.out.println(S1.length() + " " + S2.length() + " " + S3.length() );
		System.out.println(zb1.length());
		if(S1.indexOf("F") != -1)
		{
			System.out.println("Found it in the word");
		}
		else
			System.out.println("Not found in the word");
				
	}
}
