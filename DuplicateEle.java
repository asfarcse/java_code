class DuplicateEle
{
	public static void main(String args[])
	{
		int a[]={3,6,8,8,8,10,12,12,13,13};
		/*int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println("Duplicate Element: "+a[i]);
				count++;
			}
		}
		System.out.println("Total duplicate element is:"+count);*/
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				int j=i+1;
				while(a[j]==a[i])
					j++;
				System.out.println(a[i]+" appearing "+(j-i)+" times ");
				i=j-1;
			}
		}
		
	}
}