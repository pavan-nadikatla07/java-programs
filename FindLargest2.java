import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindLargest2 {
    static int sorted(int a[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        }
        return Collections.max(pq);

    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter no of elements :");
        int n=scan.nextInt();
        System.out.print("enter the elements :");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
          System.out.print(FindLargest2.sorted(a));
        
    }
    
}
