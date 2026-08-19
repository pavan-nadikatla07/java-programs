import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrifixSumArray {
    static int[] prifix(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
           a[i]+=sum;
           sum =a[i];
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
        a=PrifixSumArray.prifix(a);
        for(int i=0;i<n;i++)
        {
            System.out.print((a[i])+" ");
        }
          
        
    }
    
}
