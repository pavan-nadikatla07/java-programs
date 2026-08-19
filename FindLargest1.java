import java.util.Scanner;

public class FindLargest1 {
    static int sorted(int a[])
    {
        int max=-1;
        for(int i=0;i<a.length;i++)
        {
            max=max>a[i]?max:a[i];
        }
        return max;

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
        
          System.out.print(FindLargest1.sorted(a));
        
    }
    
}
