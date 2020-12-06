class MissingEle
{
	public static void main(String args[])
	{
		int a[]={6,7,8,9,10,12,15};
		/*int sum=0;
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			sum=sum+a[i];
		}
		int s=len*(len+1)/2;
		System.out.println("Missing element is "+(s-sum));*/
		/*int l=a[0];
		int diff=l-0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]-i!=diff)
			{
				System.out.println("Missing element is "+(i+diff));
				break;
			}
		}*/
		int l=a[0];
		int diff=l-0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]-i!=diff)
			{
				while(diff<a[i]-i)
				{
					System.out.println("Missing elements is "+(diff+i));
					diff++;
				}
			}
		}
	}
}