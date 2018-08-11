import java.util.Scanner;


public class constructor_overloading {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	constructor_overloading()
	{
		System.out.println("Addition Of Two Numbers");
		
	}
	constructor_overloading(int b)
	{
		System.out.println("Enter the A value=");
		a=s.nextInt();
		this.b=b;
		c=a+b;
		
		System.out.println("The Sum of "+a+"+"+b+"="+c);
	}
	public static void main(String ar[])
	{
		constructor_overloading b0=new constructor_overloading();
		constructor_overloading b1=new constructor_overloading(6);
	
	}
	

}
