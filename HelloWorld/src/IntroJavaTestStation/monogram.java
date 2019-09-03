package IntroJavaTestStation;

import java.util.Scanner;

public class monogram {
public static String haha(String s1, String s2, String s3){  
	
    String s = s1.substring(1,2);
    if (s1.length()>s2.length() && s2.compareTo(s3) <0 
&& s3.indexOf(s)>0){
        	System.out.println(s1.substring(0,1) + " " + s2.substring(1));

            return s1.substring(0,1) + s2.substring(1);
            
    }
    else{
            return s1.substring(0,1) + s2.substring(0,1) +
s1.substring(0,1);}
    
}

public static void main(String[] args )
{
	String s1 = "XHnnnn";
	String s2 = "FOPE";
	String s3 = "ZH";
	String s = haha(s1,s2,s3);
	System.out.println(s);
	String y = s1.substring(0,1);
	System.out.println(y);
}
}
