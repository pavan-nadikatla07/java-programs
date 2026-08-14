import java.util.*;
class ClassTwo
{
 void methodOne(int n)
 {
  System.out.println("printing numbers from 0 to "+n);
  for(int i=0;i<=n;i++)
     System.out.print(i+" ");
 }
 void methodTwo(int n)
 {
  System.out.print("\n");
  System.out.println("printing numbers from "+n+" to 0");
  for(int i=n;i>=0;i--)
     System.out.print(i+" ");
 }

}
class ClassOne
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("enter a value ");
  int n=scan.nextInt();
  ClassTwo c2=new ClassTwo();
  c2.methodOne(n);
  c2.methodTwo(n);
  
 }
}