import java.util.*;
public class CollectionInstance
{
public static void main(String[]args)
{
ArrayList<Object> al=new ArrayList<Object>();
al.add("Archana");
al.add("Harini");
al.add("Radha");
al.add("Akhila");
al.add("10");
Object o=new String("Aacha");
System.out.println(al);
for(int i=0;i<al.size();i++)
{
  Object t=al.get(i);
  if(t instanceof String)
{
      String ob1=(String)t;
      System.out.println(ob1);
  }else if(t instanceof Integer)
{
    Integer ob1=(Integer)t;
      System.out.println(ob1);
}
}
}
}