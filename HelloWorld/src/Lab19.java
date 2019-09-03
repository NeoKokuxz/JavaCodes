
public class Lab19 {
	public static void main(String[] args)
	{	
		String S1 = "animal";
		StringBuilder sb1 = new StringBuilder("Person");
		sb1.replace(2, 4, "any");
		sb1.insert(0, " ");
		System.out.println(S1 + " " + sb1 );
	}
}

