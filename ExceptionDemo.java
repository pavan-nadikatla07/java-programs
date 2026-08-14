import java.util.Scanner;
class ExceptionDemo
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  try
  {
   System.out.println("enter any two values");
   int a=scan.nextInt();
   int b=scan.nextInt();
   System.out.println("starting the division");
   int c=a/b;
   System.out.println("division completed: "+a+"/"+b+" = "+c);
  }
  catch(Exception e)
  {
   e.printStackTrace();
   System.out.println("an exception occured");
  }
  finally
  { 
   System.out.println("end of the code");
  }
 }
}