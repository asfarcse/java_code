import java.util.*;
class Asfar
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
			int c=a/b;
			
		if(c==0)
		{
		throw new Exception("Cant devided with zero");
		}
		else
			
		
			System.out.println(c);
		
	}
}