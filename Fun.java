import java.util.*;
class Fun
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String org=sc.nextLine();
		String rev="";
		int len=org.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		if(rev.equals(org))
			System.out.println("pallindrome string");
		else
			System.out.println("not pallindrome string");
	}
}