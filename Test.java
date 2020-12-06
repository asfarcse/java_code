import java.util.*;
class Test
{
    public static void main(String args[])
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("Sadaf");
        t.add("Asfar");
        t.add("Zain");
        t.add("Farish");
        System.out.println(t);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=obj1.toString();
        String s2=(String)obj2;
        return s2.compareTo(s1);
    }
}