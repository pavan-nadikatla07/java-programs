import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityqueueArray {
    static int[] sorted(int a[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        }
        int i=0;
        while(!pq.isEmpty())
        {
          a[i]=pq.poll();
          i++;
        }
        return a;

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
        a=PriorityqueueArray.sorted(a);
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i] + " ");
        }
    }
    
}
