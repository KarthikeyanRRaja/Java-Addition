import java.util.*;
public class default_constructor {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	default_constructor()
	{
		System.out.println("Enter the A and B values=");
		a=s.nextInt();
		b=s.nextInt();
	    c=a+b;
	    System.out.println("The Sum is "+c);
	}
	public static void main(String ar[])
	{
		default_constructor d=new default_constructor(); 
	}

}
