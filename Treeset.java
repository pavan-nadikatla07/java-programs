 
    import java.util.TreeSet;
import java.util.Scanner;

class Treeset {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter no of cities: ");
      int n=scan.nextInt();
      System.out.println("enter cities: ");
      TreeSet<String> ts=new  TreeSet<String>();
      for(int i=0;i<n;i++)
        {
            ts.add(scan.next());
        } 
        System.out.println("cities in TreeSet are:");
        for(String x:ts)
        {
            System.out.print(" "+x);
        }

    }
    
}

    

