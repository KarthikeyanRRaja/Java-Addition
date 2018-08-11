import java.util.*;
public class WANR_fun {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("The Sum of "+a+"+"+b+"="+c);
	}
	public static void main(String ar[])
	{
		WANR_fun b=new WANR_fun();
		b.add(5,6);
	}
}
