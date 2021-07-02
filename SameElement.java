import java.util.Scanner;
import java.util.ArrayList;
public class SameElement 
{
public static void main(String[] args)
{
ArrayList<String>al=new ArrayList<String>();
ArrayList al2=new ArrayList(al);
Scanner sc=new Scanner(System.in);
System.out.print("Please enter count: ");
int count=sc.nextInt();
al.add("archana");
for(int i=0;i<count;i++)
{
System.out.println(al2.contains("Akhila"));
ArrayList al3=new ArrayList(al);
al.add("Aruna");
System.out.println(al3.contains("Aruna"));
}
}
}

