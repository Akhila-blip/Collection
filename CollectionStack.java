import java.util.Stack;
import java.util.Iterator;  
public class CollectionStack
{  
public static void main(String args[])
{  
Stack<String> st = new Stack<String>();  
st.push("Archana");  
st.push("Gayathri");  
st.push("Aruna");  
st.push("Aditya");
st.push("Radha"); 
st.peek();
st.pop();
Iterator<String> itr=st.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next()); ;

 }  
}  
}  	