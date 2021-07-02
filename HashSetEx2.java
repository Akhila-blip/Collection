import java.util.*;
public class HashSetEx2
{
public static void main(String[]args)
{
String s="Archana";
String s1="Akhila";
System.out.println(s.hashcode());
System.out.println(s1.hashcode());
System.out.println(s.equals(s1));
HashSet<String>ha=new HashSet<>();
ha.add(s);
ha.add(s1);
System.out.println(ha);
}
}