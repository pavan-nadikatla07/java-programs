import java.util.HashSet;
import java.util.Scanner;

class UniqueElements2 {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter no of elements in array: ");
      int n=scan.nextInt();
      int[] arr=new int[n];
      int x=0;
      HashSet<Integer> hs=new  HashSet<Integer>();
      System.out.println("enter elements : ");
      for(int i=0;i<n;i++)
      {
         arr[i]=scan.nextInt();
         if(hs.contains(arr[i]))
         {
            x=1;
         }
         hs.add(arr[i]);
         
      }
 
        if(x==0)
             System.out.println("the array contains all unique values");
        else
            System.out.println("attay contains some duplicate values ");
            

    }
    
}
