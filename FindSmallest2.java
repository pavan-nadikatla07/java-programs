import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindSmallest2 {
    static int sorted(int a[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        }
        return pq.poll();

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
          System.out.print(FindSmallest2.sorted(a));
        
    }
    
    
}
