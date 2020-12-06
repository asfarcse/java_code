import java.util.*;
class Toh
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		toh(n,'A','C','B');
		
	}
	static void toh(int n,char s,char d,char i)
	{
		if(n==1)
		{
			System.out.println("moving from source " + s + " to destination " + d);
			return;
		}
		toh(n-1,s,i,d);
		System.out.println("moving disk" + n +" from source " + s + " to destination " + d);
		toh(n-1,i,d,s);
	}
}