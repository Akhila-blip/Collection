import java.util.Scanner;
import java.util.ArrayList;
public class SameElementEx
{
public static void main(String[]args)
{
ArrayList<String>al=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("please enter count:");
int count=sc.nextInt();
for(int i=0;i<count;i++)
{
System.out.println("please enter name:");
String name=sc.next();
if(al.contains(name))
{
al.add(name);
}
}
System.out.println(al.contains("aruna"));
System.out.println(al);
}
}