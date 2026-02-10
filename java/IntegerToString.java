package pst;
import java.util.Scanner;

public class IntegerToString {
       public static void main (String [] args)
       {
    	   Scanner sc = new Scanner (System.in);
    	   int num = sc.nextInt();
    	   
    	   System.out.println("Enter a number:" + num);
    	   
    	   a obj = new a();
    	   obj.method1(num);
       }
}
class a
{
	 public void method1(int num)
	 {
		 String str = String.valueOf(num);
		 System.out.println(str);

	 }
}