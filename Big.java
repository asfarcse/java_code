import java.math.BigInteger;
import java.util.*;
class Big
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		long total=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			total+=arr[i];
		}
        System.out.println(total);
    }
}