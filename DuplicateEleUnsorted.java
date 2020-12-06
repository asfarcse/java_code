class DuplicateEleUnsorted
{
	public static void main(String args[])
	{
		int a[]={8,3,6,4,6,5,6,8,2,7};
		for(int i=0;i<a.length-1;i++)
		{
			int count=1;
			if(a[i]!=-1)
			{
			for(int j=1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			
			if(count>1)
			{
				System.out.println(a[i]+" repeats "+count+" times ");
			}
			}
		}
	}
}