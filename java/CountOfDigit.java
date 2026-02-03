package pst;
import java.util.Scanner;


public class CountOfDigit {
	public static void main(String[] args) {
       int num = 1234567;
       int CountOfDigit = 0;
       
       while (num!=0) {
    	   num=num/10;
        CountOfDigit++;
       }
       
      System.out.println("count of digit:"+CountOfDigit);
}
}