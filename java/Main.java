/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int item1= 4;
	    int item2=3;
        //System.out.println("equal to = "+ (item1=item2));
		System.out.println("plus equal to = "+ (item1+=item2));
		System.out.println("minus equal to = "+ (item1-=item2));
		System.out.println("multi equal to = "+ (item1*=item2));
		System.out.println("division equal to = "+ (item1/=item2));
		System.out.println("modulo equal to = "+ (item1%=item2));
	}
}