import java.util.*;
class IteratorExample
{
public static void main(String[] arg)
{
ArrayList<Object> al=new ArrayList<Object>();
al.add("ramya");
al.add("Harshi");
al.add("Madhulika");
al.add("Raguram");
al.clear();
al.add(10);
Object[] obar =al.toArray();
Iterator<Object> it= al.iterator();
while(it.hasNext()){
Object s=it.next();
  System.out.println(s);
}
}
}