class DuplicateEle1
{
	public static void main(String args[])
	{
		int a[]={3,6,8,8,8,8,8,10,12,12,12,12,12,13};
		int h[]=new int[14];
		for(int i=0;i<a.length;i++)
		{
			h[a[i]]++;
		}
		for(int i=0;i<h.length;i++)
		{
			if(h[i]>1)
			{
				System.out.println(i+" repeats "+h[i]+" times");
			}
		}
			
	}
}