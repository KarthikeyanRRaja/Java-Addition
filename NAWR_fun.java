import java.util.*;
public class NAWR_fun {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public int add()
	{
		System.out.println("Enter the A value=");
		a=s.nextInt();
		System.out.println("Enter the B value=");
		b=s.nextInt();
		c=a+b;
		return c;
	}
	public static void main(String ar[])
	{
		NAWR_fun g=new NAWR_fun();
		int v;
		v=g.add();
		System.out.println("The sum of "+g.a+"+"+g.b+"="+v);
	}
}
