import java.util.*;  
public class HashSetEx
{  
public static void main(String args[])
{  
HashSet<String> set=new HashSet<String>(); set.add("Raji");  
set.add("Adhi");  
set.add("Renu");  
set.add("Lalitha");  
 Iterator<String> itr=set.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  