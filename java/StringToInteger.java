package pst;
import java.util.Scanner;

public class StringToInteger {
	public static void main (String [] args)
    {
 	   Scanner sc = new Scanner (System.in);
 	   int num = sc.nextInt();
 	  
 	   Z obj = new Z();
 	   obj.method1(num);
    }
}
class Z
{
	 public void method1(int number)
	 {
		String str="68";
		Integer x = Integer.valueOf(str);
        System.out.println("Converted Integer object: " + x); 
	 }
}
