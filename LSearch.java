import java.util.*;
class LSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the"+n+ "element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
		
			if(key==arr[i])
				System.out.println("Elemet found at index:"+i);
				break;
				System.out.println("Element not found");
			
	}
}