import java.util.*;  
class IteratorEx
{  
public static void main(String args[])
{  
ArrayList<String> list=newArrayList<String>(); 
list.add("Archana"); 
list.add("Radha");  
list.add("Savithri");  
list.add("Jessie");  
  Iterator itr=list.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  
