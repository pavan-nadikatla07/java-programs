import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindSmallest1 {
    static int sorted(int a[])
    {
        int min=9999;
        for(int i=0;i<a.length;i++)
        {
            min=min<a[i]?min:a[i];
        }
        return min;

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
        
          System.out.print(FindSmallest1.sorted(a));
        
    }
    
    
}
