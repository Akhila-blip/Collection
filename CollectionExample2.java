import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
class CollectionExample2
{
public static void main(String[] arg)
{
ArrayList<String> al=new ArrayList<String>();
al.add("Archana");
al.add("Harini");
al.add("Radha");
al.add("Akhila");

Object[] obar =al.toArray();

System.out.println(al);
for(int i=0;i<al.size();i++)
{
  String st=al.get(i);
      System.out.println(st);
}
for(String o:al)
{

    System.out.println(o);
}
}
}