class MissingEle1
{
	public static void main(String args[])
	{
	int a[]={3,7,4,9,12,1,6,11,2,10};
	int h[]=new int[15];
	for(int i=0;i<a.length;i++)
	{
		h[a[i]]++;
	}
	for(int i=0;i<h.length;i++)
	{
		if(h[i]==0)
		{
			System.out.println("Missing element is "+i);
		}
	}
	
	}
}
