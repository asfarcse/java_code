import java.util.*;
class Bcc
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		for(int i=0;i<arr.length;i++)
			if(arr[i]==max)
				count++;
		System.out.println(count);
	}
}