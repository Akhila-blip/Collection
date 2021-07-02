import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
public class Consumer 
{
public static void main(String[] args) 
{
ArrayList<String> al=new ArrayList<String>();
al.add("Archana");
al.add("Tulasi");
al.add("Siva");
al.add("Manasa");
Object[] obar =al.toArray();
 Consumer<String> method = (n) -> 
{ 
System.out.println(n); 
};
al.forEach(System.out::println);
al.forEach(e -> 
{
  System.out.println(e);
});

}
}