import java.util.LinkedHashSet;
import java.util.Scanner;

class LinkedHashset {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter no of cities: ");
      int n=scan.nextInt();
      System.out.println("enter cities: ");
      LinkedHashSet<String> hs=new  LinkedHashSet<String>();
      for(int i=0;i<n;i++)
        {
            hs.add(scan.next());
        } 
        System.out.println("cities in Linkedhashset are:");
        for(String x:hs)
        {
            System.out.print(" "+x);
        }

    }
    
}
