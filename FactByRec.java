import java.util.*;
class FactByRec
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	FactByRec obj=new FactByRec();
	int res=obj.calcFact(n);
	System.out.println(res);
	}
	int calcFact(int no)
	{
		if(no>=1)
		{
			return(no*calcFact(no-1));
		}
		return 1;
	}
}