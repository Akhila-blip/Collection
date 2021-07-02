import java.util.*;
public class CollectionExample3
{
public static void main(String[] arg)
{
List<Integer> li=new ArrayList<Integer>(); 
li.add(20);
li.add(10);
li.add(10);
li.add(30);

System.out.println(li);
for(int i=0;i<li.size();i++)
{
  Integer ob=(Integer)li.get(i);
  System.out.println(ob);
}
}
}