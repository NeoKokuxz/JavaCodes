
public class Java0205 
{	
	public static void main(String[] args)
	{
	double gpa, result;
	for(gpa=0.0; gpa<=4.0; gpa=gpa+0.5)
	  {
		System.out.printf("%15.2f",gpa);
		System.out.println();
		result= (gpa*gpa*gpa+7*gpa)/(gpa*gpa-(gpa+5/3));
		System.out.printf("%15.2f",result);
		System.out.println();
			if(result>0)
			{
				System.out.print( "admit");
				System.out.println();
			}
	  }	
	}
}
//printf <- print format it's gonna be %f for decimal %d for integer; 
// width.precision %10.4f  
// \t <- print a tab space