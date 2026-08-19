import java.util.*;

public class PriorityqueueStringsMax {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter no of Strings :");
        int n=scan.nextInt();
        PriorityQueue<String> pq=new PriorityQueue<>(Collections.reverseOrder());
         System.out.print("enter the Strings :");
        for(int i=0;i<n;i++)
        {
            pq.add(scan.next());
        }
        while(!pq.isEmpty())
        {
          System.out.print(pq.poll() + " ");
        }
    }
    
}
