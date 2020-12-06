import java.util.*;
class Asfarr
{
	void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("sum is:"+z);
	}
	void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Sub is:"+z);
	}
	void mul(int x,int y)
	{
		int z=x*y;
		System.out.println("Mul is:"+z);
	}
}
class Arith
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two values to get all result");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Asfarr obj=new Asfarr();
		obj.sum(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
	}
}