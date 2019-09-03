//ClassCode 1-31-18

/* public class IntroToJava {
	public static void main(String[] args){
		int number, sum;
		number=4;
		sum=number*number;
		System.out.println(number+"x"+sum);
		number++;
		sum=number*number;
		System.out.println(number+"x"+sum);
		
		for(int i=number; i<= 10; i++){
			System.out.println(i);
			System.out.println("Next");
		}
	}
} */
public class IntroToJava {
	public static void main(String[] args){
		int number, sum;	
		number=4;
		for(int i=number; i<= 10; i++){
			sum=i*i;
			System.out.println(i+" "+sum);
			System.out.println("Next");
		}
	}
}

//println <-new line print <-print on same line. 
