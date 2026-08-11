import java.util.*;
public class MissingAndDuplicate {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("enter numbers from 1 to "+n+" (inclusive):");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int[] h=new int[n+1];
        for(int i=0;i<n;i++)
        {
            h[a[i]]++;
        }
        for(int i=1;i<n+1;i++)
        {
           if(h[i]==0)
             System.out.println("missing number is :"+i);
           if(h[i]>=2)
             System.out.println("duplicate number is :"+i);
        }

    }
    
}
