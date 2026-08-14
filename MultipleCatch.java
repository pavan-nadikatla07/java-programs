import java.util.Scanner;
class MultipleCatch
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  int[] arr=new int[5];
  try
  {
   System.out.println("enter any five elements");
   for(int i=0;i<5;i++)
   {
    arr[i]=scan.nextInt();
   }
   System.out.println("enter indexes of two elements to perform devision");
   int a=scan.nextInt();
   int b=scan.nextInt();
   System.out.println("starting the division");
   int c=arr[a-1]/arr[b-1];
   System.out.println("division completed: "+arr[a-1]+"/"+arr[b-1]+" = "+c);
  }
  catch(ArithmeticException e)
  {
   System.out.println("arithmetic exception occurred :cant divide with 0");
  }
  catch(NumberFormatException e)
  {
   System.out.println("number format exception occurred :entered element is not a number");
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("array out of bounds exception occurred :entered index is out of limit");
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