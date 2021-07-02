import java.util.*;  
public class HashSetEx1
{  
public static void main(String args[])
{  
HashSet<String> set=new HashSet<String>(); set.add("Raji");  
set.add("Adhi");  
set.add("Renu");  
set.add("Lalitha");  
System.out.println(set); 
System.out.println(set.size());
HashSet s1=new HashSet(set);
System.out.println(s1.contains("Raji"));
 }  
}  
