import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ListExamples 
{
public static void main(String[]args)
{
List<String> al=new ArrayList<String>();
al.add("Radha");
al.add("Venu");
al.add("Renu8");
al.add("Venu2");
al.remove(3);
List<String> al2=new ArrayList<String>();
for(String c:al) 
{
if(c.startsWith("R")) 
{
al2.add(c);
}
}
List<String> al1 =al.stream().filter(e-> e.startsWith("R")).collect(Collectors.toList());
System.out.println(al1);
}
}

