/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int person1=40;
	    int person2=30;
	    int person3=70;
	    
    if(person1>person2 && person1>person3)
    {
		System.out.println("person1 is greater");
        if (person2>person1 && person2>person3)
        {
        System.out.println("person2 is greater");
    	}
    }
    else
        {
        System.out.println("person3 is greater");
        }
	}	
}
