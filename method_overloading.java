import java.util.*;
public class method_overloading {
int add(int a,int b)
{
	int c;
	c=a+b;
	return c;
}
double add(double a,double b)
{
	double c;
	c=a+b;
	return c;
}
public static void main(String ar[])
{
	method_overloading g=new method_overloading();
	System.out.println("The Sum of two integers is"+g.add(5,6));
	System.out.println("The Sum of two float values is"+g.add(4.1,5.2));
}
}
