class insert
{
	public static void main(String args[])
	{
		int arr[10]={4,8,13,16,20,25,28,22};
		int i=arr.length();
		int x=18;
		while(A[i]>x)
		{
			A[i+1]=A[i];
			i--;
		}
		A[i+1]=x;
	}
}