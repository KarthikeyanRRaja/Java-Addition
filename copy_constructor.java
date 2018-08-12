
public class copy_constructor {
	int a,b;
	copy_constructor(int a,int b)
	{
		System.out.println("The Sum of two numbers using COPY CONSTRUCTOR");
		this.a=a;
		this.b=b;
	}
	copy_constructor(copy_constructor c)
	{
		a=c.a;
		b=c.b;
		System.out.println("The sum is "+(a+b));
		
	}
	public static void main(String ar[])
	{
		copy_constructor v=new copy_constructor(5,2);
		copy_constructor v1=new copy_constructor(v);
		
	}



}
