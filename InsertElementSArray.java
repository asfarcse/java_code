class InsertElementSArray
{
    public static void main(String ars[])
    {
        int A[]={4,8,13,16,20,25,28,33};
        int x=18;

        int i=A.length;
        while(A[i]>x)
        {
            A[i+1]=A[i];
            i--;
        }
        A[i+1]=x;
        for(int j=0;i<A.length;j++)
        {
            System.out.print(" "+A[j]);
        }        
    }
}