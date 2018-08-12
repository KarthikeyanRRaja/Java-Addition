class additi
{
	additi(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum Of"+a+"and "+b+"is "+c);
	}
}
class sum11 extends addition
{
	sum11(int a, int b) {
		super(a, b);
	}


}
public class super_add {
	public static void main(String ar[])
	{
		sum11 s=new sum11(5,2);
	}
}
