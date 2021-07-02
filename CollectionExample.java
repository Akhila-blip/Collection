import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionExample
{

public static void main(String[] arg)
{
List<String>l=new ArrayList<>();
l.add("Archana");
List l3=new ArrayList(l);
Collection l5=new ArrayList(l);
ArrayList l6=new ArrayList(l);
System.out.println(l6.size());
System.out.println(l6.isEmpty());
System.out.println(l6.contains("Archana"));
System.out.println(l6.remove("A"));
System.out.println(l6.get(1));
System.out.println(l6);
}

}