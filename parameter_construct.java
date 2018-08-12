
public class parameter_construct {
	int c;
	parameter_construct(int a,int b)
	{
		c=a+b;
		System.out.println("The Sum of "+a+"+"+b+"="+c);
	}
	public static void main(String ar[])
	{
		parameter_construct c=new parameter_construct(5,6) ; 
	}

}
