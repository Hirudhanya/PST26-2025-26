import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("enter a Ds mark :");
		int m1 =sc.nextInt();
		
		System.out.println("enter a oops mark :");
		int m2 =sc.nextInt();
		
		System.out.println("enter a cloud mark :");
		int m3 =sc.nextInt();
		
		System.out.println("Total mark :"+(m1+m2+m3));
		System.out.println("Average mark :"+((m1+m2+m3)/3));
		
	}
}
