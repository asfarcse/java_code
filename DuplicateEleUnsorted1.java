import java.util.*;
class DuplicateEleUnsorted1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int sz=sc.nextInt();
		int a[]=new int[sz];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		//System.out.println(max);
		int h[]=new int[max];
		for(int i=0;i<a.length-1;i++)
		{
			h[a[i]]++;
		}
		for(int i=0;i<max-1;i++)
		{
			System.out.println(h[i]);
		}
		for(int i=0;i<max-1;i++)
		{
			if(h[i]>1)
			{
			System.out.println(i+" repeats "+h[i]+" times");
			}
		}
		
	}
}