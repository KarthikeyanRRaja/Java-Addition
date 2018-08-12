
public class this_add {
	int num1,num2,sum;
	int fun(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		sum=num1+num2;
		return sum;
	}
	public static void main(String ar[]){
		this_add k=new this_add();
		System.out.println(k.fun(7, 4));
	}

}
