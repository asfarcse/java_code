import java.util.*;
class Dutch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size to enter 0 and 1");
		int sz=sc.nextInt();
		int arr[]=new int[sz];
		for(int i=0;i<sz;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count0=0,count1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				count0++;
			else
				count1++;
		}
		for(int i=0;i<count0;i++)
		{
			arr[i]=0;
		}
		for(int i=count0;i<(count0+count1);i++)
		{
			arr[i]=1;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}