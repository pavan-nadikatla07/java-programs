import java.util.*;

public class PriorityqueueMax {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter no of elements :");
        int n=scan.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
         System.out.print("enter the elements :");
        for(int i=0;i<n;i++)
        {
            pq.add(scan.nextInt());
        }
        while(!pq.isEmpty())
        {
          System.out.print(pq.poll() + " ");
        }
    }
    
}
