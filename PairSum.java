class PairSum
{
	public static void main(String args[])
	{
		//int a[]={6,3,8,10,16,7,5,2,9,14};
		/*int k=10;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
					System.out.println(a[i]+"+"+a[j]+"="+k);
			}
		}*/
		//int a[]=new int[20];
		 int a[]={1,3,4,5,6,8,9,10,12,14};
		
		int k=10;
		for(int i=0,j=a.length-1;i<j;)
		{
			if(a[i]+a[j]==k)
			{
				System.out.println(a[i]+"+"+a[j]+"="+k);
				i++;
				j--;
			}
			else if(a[i]+a[j]<k)
			
				i++;
			else
				j++;	
		}
	}   
}