import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueStringsMin {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter no of elements :");
        int n=scan.nextInt();
        PriorityQueue<String> pq=new PriorityQueue<>();
         System.out.print("enter the elements :");
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
