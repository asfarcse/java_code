import java.util.Scanner;
class MergeArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arr1");
        int m=sc.nextInt();
        System.out.println("Enter the size of Arr2");
        int n=sc.nextInt();

        int arr1[]=new int[m];
        int arr2[]=new int[n];
        int arr3[]=new int[11];
        int k=0,i=0,j=0;
        for( i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for( j=0;j<n;j++)
        {
            arr2[j]=sc.nextInt();
        }

        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
            arr3[k++]=arr1[i++];
            else
            arr3[k++]=arr2[j++];
        }
        for(;i<m;i++)
        arr3[k++]=arr1[i];
        for(;j<n;j++)
        arr3[k++]=arr2[j];

        for(k=0;k<20;k++)
        {
            System.out.print(arr3[k]);
        }

    }
}