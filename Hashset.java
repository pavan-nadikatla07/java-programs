import java.util.*;
class Hashset {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter no of cities: ");
      int n=scan.nextInt();
      System.out.println("enter cities: ");
      HashSet<String> hs=new  HashSet<String>();
      for(int i=0;i<n;i++)
        {
            hs.add(scan.next());
        } 
        System.out.println("cities in hashset are:");
        for(String x:hs)
        {
            System.out.print(" "+x);
        }

    }
    
}
