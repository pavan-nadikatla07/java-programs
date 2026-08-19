import java.util.Scanner;

public class SufixSumArray {
    static int[] sufix(int a[])
    {
        int sum=0;
        for(int i=a.length-1;i>=0;i--)
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
        a=SufixSumArray.sufix(a);
        for(int i=0;i<n;i++)
        {
            System.out.print((a[i])+" ");
        }
          
        
    }
    
}
